<%@ page import="web.messages" %>
<%@ page import="web.Message" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
    <%
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String username = (String)session.getAttribute("username");
        Date date = new Date();
        Message message = new Message(messages.count(),title,username,date,content);
        messages.addMessage(message);
        response.sendRedirect("message.jsp");
    %>
</body>
</html>
