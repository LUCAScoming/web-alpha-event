    <html>
    <head><title>login test</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
        <script type="text/javascript">
            function login() {
                $.ajax({
                    type: "GET",
                    dataType: "json",//服务器返回的数据类型
                    contentType: "application/json",//post请求的信息格式
                    url: "http://localhost:8080/alpha/owner/123456789",
                    // data: {id:"123456789"},
                    success: function (result) {
                        console.log(result);//在浏览器中打印服务端返回的数据(调试用)
                        if (result.resultCode == 200) {
                            alert(result);
                        }

                    },
                    error: function (error) {
                        alert("异常！" + error);
                    }
                });
            }


        </script>
    </head>
    <body>
    <div id="form-div">GET请求
        <form id="form1" onsubmit="return false" action="##" method="post">
            <p>用户名：<input type="text" id="txtUserName" tabindex="1" size="15" name="id" value="123456789"/></p>
            <p><input type="button" value="请求" onclick="login()">&nbsp;<input type="reset" value="重置"></p></form>


    </div>
    </body>
    </html>
