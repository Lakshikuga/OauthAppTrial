<%--
  Created by IntelliJ IDEA.
  User: lakshi
  Date: 10/4/21
  Time: 9:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OauthApp</title>
    <link href="./css/signup.css" rel="stylesheet">
    <!--link rel="stylesheet" type="text/css" href="<!-c:url value="./css/signup.css"-->
    <meta name="google-signin-client_id" content="104146013680-a94or8bthr0jpkdu7kgm1a2lkakc1a7m.apps.googleusercontent.com">
    <h1 style="text-align: center">OAUTHAPP</h1>
</head>
<body>
<div class="login-form">
    <div class="left-form">
        <h1>Sign Up</h1>
        <input type="text" name="username" placeholder="UserName"><br><br>
        <input type="password" name="pw" placeholder="Password"><br><br>
        <input type="submit" value="Sign Up">
    </div>

    <div class="vl-up"></div>
    <div class="or">OR</div>
    <div class="vl-down"></div>

    <div class="right-form">
        <span class="signinwith">Sign In With<br/>Social Network</span>

        <form class="social" action="signin" method="get">
        <!--button class="social facebook">Sign In with Facebook</button><br><br-->

       <!--button class="social google">Sign In with Google</button></a-->

        <!--input type="submit" value="Sign In with Facebook" class="social facebook"-->
        <input type="submit" value="Sign In with Google" class="social google">

        </form>
    </div>

</div>

</body>
</html>