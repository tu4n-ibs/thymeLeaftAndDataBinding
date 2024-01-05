<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 02/01/2024
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<%--@elvariable id="login" type="com.example.thuchanh2"--%>
<form:form method="post" action="login" modelAttribute="login">
<fieldset>
    <legend>Login</legend>
    <table>
        <tr>
            <td><form:label path="account">Account:</form:label></td>
            <td><form:input path="account"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Password:</form:label></td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <form:button>Login</form:button>
        </tr>
    </table>
</fieldset>
</form:form>
</body>
</html>
