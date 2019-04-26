package com.pjb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

/**
 * @author:Lucas
 * @description:对系统后台进行跨域访问进行配置
 * @Date:2019/3/8
 **/
@Configuration
public class CorssConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")// 1 设置访问源地址
                .allowCredentials(true)// 2 设置访问源请求头
                .allowedMethods("GET", "POST", "DELETE", "PUT", "OPTIONS") // 3 设置访问源请求方法
                .maxAge(3600);
    }


    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedHeader("*"); // 允许任何的head头部
        corsConfiguration.addAllowedOrigin("*"); // 允许任何域名使用
        corsConfiguration.addAllowedMethod("*"); // 允许任何的请求方法
        corsConfiguration.setAllowCredentials(true);
        return corsConfiguration;

    }


    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }


    @Override
    public void configurePathMatch(PathMatchConfigurer pathMatchConfigurer) {

    }


    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer contentNegotiationConfigurer) {

    }


    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer asyncSupportConfigurer) {

    }


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer) {

    }


    @Override
    public void addFormatters(FormatterRegistry formatterRegistry) {

    }


    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry) {

    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {

    }


    @Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {

    }


    @Override
    public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {

    }


    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> list) {

    }


    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list) {

    }


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> list) {

    }


    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> list) {

    }


    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }


    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }


    @Override
    public Validator getValidator() {
        return null;
    }


    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }


}
