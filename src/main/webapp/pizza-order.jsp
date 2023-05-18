<%--
  Created by IntelliJ IDEA.
  User: savannamccauley
  Date: 5/17/23
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<form action="pizza" method="post">
    <label for="crust">Crust</label>
    <select name="crust" id="crust">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
    </select>
    <br>

    <label for="size">Size</label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="big">Big</option>
    </select>
    <br>
    <label>Toppings</label>
    <input type="checkbox" name="toppings" value="pepperoni">Pepperoni
    <input type="checkbox" name="toppings" value=jalepenos>Jalepenos
    <input type="checkbox" name="toppings" value="chicken">Chicken
    <br>

    <label for="address">Delivery Address</label>
    <input type="text" id="address" name="address">
    <br>
    <input type="submit" value="Submit">


</form>

</body>
</html>
