<%--
  Created by IntelliJ IDEA.
  User: Sus
  Date: 02.09.2022
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add event</title>
</head>
<body>
Please input events data:
<form action="/events/add" method="post">
    <input type="text" name="name" placeholder="please input name"/> <br>
    <input type="text" name="place" placeholder="please input place"/> <br>
    Is Online? <br>
    Yes <input type="radio" name="isOnline" value="true">
    No <input type="radio" name="isOnline" value="false"> <br>
    <input type="number" name="price" placeholder="please input price"/> <br>
     Event Type
    <select name="eventType">
        <option value="MOVIE">M0VIE</option>
        <option value="CONCERT">CONCERT</option>
    </select> <br>
    <input type="submit" value="Add">



</form>
</body>
</html>
