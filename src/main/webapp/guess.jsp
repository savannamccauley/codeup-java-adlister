<%--
  Created by IntelliJ IDEA.
  User: savannamccauley
  Date: 5/18/23
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/guess" method="post">
        <label for="number">Guess a number</label>
        <input type="number" id="number" placeholder="Number between 1-3">
        <button>Submit</button>
    </form>

</body>
</html>
