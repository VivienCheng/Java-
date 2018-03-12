
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<%
    if (session.getAttribute("already_exist") != null) {
        if ((Boolean) session.getAttribute("already_exist")) {
            session.setAttribute("already_exist", false);
            out.print("用户名已存在");
        }
    }
%>
<form action="check.jsp">
    username:<br>
    <input type="text" name="username">
    <input type="submit" name="submit">
</form>
</body>
</html>
