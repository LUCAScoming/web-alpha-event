package com.pjb.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.pjb.entity.TokenInfo;
import com.pjb.entity.User;
import com.pjb.entity.UserInfo;
import com.pjb.mapper.UserInfoMapper;
import com.pjb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.io.UnsupportedEncodingException;
import java.util.*;



/**
 * @author:Lucas
 * @description:
 * @Date:2019/3/5
 **/
@Service
public class UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TokenInfo tokenInfo;
    public List<UserInfo> getUserInfo(){
        return userInfoMapper.selectAll();
    }
    public User getUser(String username,String password){
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("username",username)
                .andEqualTo("password")
                .andEqualTo("dr",0);
        return userMapper.selectOneByExample(example);
    }


    public String createToken(Long memberId, String username) throws Exception {
        Date iatDate = new Date();
        // expire time
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(TokenInfo.calendarField, TokenInfo.calendarInterval);
        Date expiresDate = nowTime.getTime();

        // header Map
        Map<String, Object> HeadMap = new HashMap<>();
        HeadMap.put("alg", "HS256");
        HeadMap.put("typ", "JWT");

        // build token
        // param backups {iss:Service, aud:APP}
        try {
            String token = JWT.create().withHeader(HeadMap) // header
                    .withClaim("iss", "Service") // payload
                    .withClaim("aud", "WXAPP")
                    .withClaim("memberId", null == memberId ? null : memberId.toString())
                    .withClaim("username", null == username ? null : username)
                    .withIssuedAt(iatDate) // sign time
                    .withExpiresAt(expiresDate) // expire time
                    .sign(Algorithm.HMAC256(TokenInfo.SECRET)); // signature
            return token;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        } catch (JWTCreationException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }

    }

    public User getUserByToken(String token) {
        User user = new User();
        if (StringUtils.isEmpty(token)) {
            return new User();
        }
        Map<String, Claim> map = decryToken(token);
        if (map == null) {
            return new User();
        }
        Long userId = map.get("memberId").asLong();
        String userName = map.get("username").asString();
        user.setId(userId);
        user.setUsername(userName);
        return user;
    }

    public Map<String, Claim> decryToken(String token) {
        DecodedJWT jwt = null;
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(tokenInfo.getSECRETKEY())).build();
            jwt = verifier.verify(token);
        } catch (Exception e) {
            // e.printStackTrace();
            // token 校验失败, 抛出Token验证非法异常
        }
        return jwt.getClaims();
    }

    public User vailUser(String userName, String password) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("username", userName)
                .andEqualTo("password", password);
//                .andEqualTo("dr", 0);
        return userMapper.selectOneByExample(example);
    }
}
