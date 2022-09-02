<%--
  Created by IntelliJ IDEA.
  User: Sus
  Date: 03.09.2022
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add user</title>
</head>
<body>

Please input users data:
<form action="/users/add" method="post">
    <input type="text" name="name" placeholder="please input name"/> <br>
    <input type="text" name="surname" placeholder="please input surname"/> <br>
    <input type="text" name="email" placeholder="please input email"/> <br>
    <input type="number" name="eventId" placeholder="please input eventId">
    </select> <br>
    <input type="submit" value="Add">



</form>

</body>
</html>
