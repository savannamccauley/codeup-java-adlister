<%--
  Created by IntelliJ IDEA.
  User: savannamccauley
  Date: 5/17/23
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action ="login.jsp" method="POST">
    <label for="username">Username</label>
    <input type="text" name ="username" id="username">
    <label for="password">Password</label>
    <input type="text" name="password" id="password">
    <button type="submit">Submit</button>



    <c:if test='<%=request.getMethod().equalsIgnoreCase("post")%>'>
        <c:choose>

        <c:when test="${param.username.equalsIgnoreCase('username') && param.password.equalsIgnoreCase('password')}">
            <c:redirect url="profile.jsp"/>
            <h1>You are logged in</h1>

        </c:when>
        <c:otherwise>
            <c:redirect url = "login.jsp"/>
        </c:otherwise>
    </c:choose>
    </c:if>

</form>
</body>
</html>
