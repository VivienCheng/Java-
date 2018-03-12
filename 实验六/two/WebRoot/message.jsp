<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="web.Message" %>
<html>
<head>
    <title>留言板</title>
</head>
<body>
<%
    if (session.getAttribute("login") != null) {
        if ((Boolean) session.getAttribute("login")) {

        } else {
            response.sendRedirect("login.jsp");
        }
    } else {
        session.setAttribute("login", false);
        response.sendRedirect("login.jsp");
    }
%>
<h1>留言板</h1>
<jsp:useBean id="messages" class="web.messages" scope="application"/>

<table>
<%
    for(Message message: messages.getData_()){
        out.print("<tr>");
        out.print("<td>");
        out.print(message.getId_());
        out.print("</td>");
        out.print("<td>");
        out.print(message.getDate());
        out.print("</td>");
        out.print("<td>");
        out.print(message.getTitle_());
        out.print("</td>");
        out.print("<td>");
        out.print(message.getUsername_());
        out.print("</td>");
        out.print("</tr>");
    }

%>
</table>
<form action="addMessage.jsp">
    <button type="submit">添加</button>
</form>

</body>
</html>
