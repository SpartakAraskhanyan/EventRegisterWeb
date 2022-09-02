<%@ page import="java.util.List" %>
<%@ page import="model.Event" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Events page</title>
</head>
<body>

<%
    List<Event> events = (List<Event>) request.getAttribute("events");

%>
<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>place</th>
        <th>isOnline</th>
        <th>price</th>
        <th>event type</th>

    </tr>

    <%
        for (Event event : events) { %>

    <tr>
        <td><%=event.getId()%>
        </td>
        <td><%=event.getName()%>
        </td>
        <td><%=event.getPlace()%>
        </td>
        <td><%=event.isOnline()%>
        </td>
        <td><%=event.getPrice()%>
        </td>
        <td><%=event.getEventType().name()%>
        </td>


    </tr>

    <% } %>

</table>
</body>
</html>
