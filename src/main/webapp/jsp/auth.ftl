<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org" xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
    <link href="/css/bootsrtap.min.css" rel="stylesheet">

</head>
<body>

<div class="form-style-2-heading">
    <h2>Hello!</h2>
</div>

<#if error??>
<div class="alert alert-danger" role="alert">Логин или пароль введены неверно</div>
</#if>


<div class="form-style-2">
    <form method="post" action="/SignIn">
        <label for="login">Login:
            <input class="input-field" type="text" id="login" name="login">
        </label>
        <br/>
        <label for="login">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <br/>
        <input name="submit" type="submit" value="Sign in">

    </form>
    <br/>or
    <br/>
</div>

</body>
</html>