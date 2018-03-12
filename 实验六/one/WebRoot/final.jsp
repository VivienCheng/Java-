
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>final</title>
</head>
<body>
    <h1>Welcome!</h1>
    <%
        out.print((String)session.getAttribute("username"));
    %>
</body>
</html>
