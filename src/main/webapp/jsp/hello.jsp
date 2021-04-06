<%--
  Created by IntelliJ IDEA.
  User: Fonin572
  Date: 31.03.2021
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">

<head>
    <title>Hello World!</title>
</head>
<body>
<h1 th:inline="text">Hello </h1>
<form th:action="@{/logout}" method="post">
    <input type="submit" value="Sign Out"/>
</form>
</body>
</html>
<%--${cookie.}--%>