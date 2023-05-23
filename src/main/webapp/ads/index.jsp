<%--
  Created by IntelliJ IDEA.
  User: savannamccauley
  Date: 5/19/23
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${allAds}" var="ads">
    <div>
    <h1>${ads.id}</h1>
    <h1>User ID:  ${ads.userId}</h1>
    <h2>${ads.title}</h2>
    <p>${ads.description}</p>
    </div>
</c:forEach>

</body>
</html>
