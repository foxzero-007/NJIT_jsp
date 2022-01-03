<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <!--Jquery依赖-->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <!--BOOTSTARP-CORE-->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
    <!--BOOTSTARP-CSS-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <link rel="stylesheet" href="css/index.css" crossorigin="anonymous">
    <link rel="stylesheet" href="css/common.css" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="login">
        <div class="login-form">
            <input type="text" class="input-login" id="name" placeholder="Username">
            <input type="text" class="input-login" id="password" placeholder="Password">
        </div>
        <div class="submit-button">
            <button class="button-blue" onclick="login()">登录</button>
        </div>
    </div>
</div>
<script>
    function login(){
        var user={}
        user.username=$("#name").val().toString()
        user.password=$("#password").val().toString()
        $.post("<%=request.getContextPath()%>/user",user,function (data){
            console.log(data)
        })
    }
    function search(){
        $.get("<%=request.getContextPath()%>/user","id="+$(".input_label").val(),function (data){
            console.log(data)
            var html = `<div>${data.name}</div>`
            $(".container").append(html)
        },"json")
    }
</script>
</body>
</html>
