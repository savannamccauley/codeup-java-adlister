<%--
  Created by IntelliJ IDEA.
  User: savannamccauley
  Date: 5/19/23
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${albums}" var="album">
    <div>
        <h3>${album.getName()}</h3>
        <p>${album.getPopSong()}</p>
        <p>${album.getNum()}</p>
    </div>

</c:forEach>

</body>
</html>
