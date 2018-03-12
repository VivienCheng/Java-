<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>check</title>
</head>
<body>
<%
    String username_input = request.getParameter("username");
    System.out.println(username_input);
    if (session.getAttribute("usernames") != null) {
        ArrayList<String> usernames = (ArrayList<String>) session.getAttribute("usernames");
        Boolean already_exist = false;
        for (String username_already_exist : usernames) {
            System.err.println(username_already_exist);
            if (username_already_exist.equals(username_input)) {
                session.setAttribute("already_exist", true);
                already_exist = true;
            }
        }
        if(already_exist){
            response.sendRedirect("login.jsp");
        }
        else {
            System.out.println(usernames);
            usernames.add(username_input);
            session.setAttribute("login", true);
            session.setAttribute("usernames", usernames);
            session.setAttribute("username",username_input);
            response.sendRedirect("message.jsp");
        }
    } else {
        ArrayList<String> usernames = new ArrayList<String>();
        usernames.add(username_input);
        System.out.println(usernames);
        session.setAttribute("usernames", usernames);
        session.setAttribute("username",username_input);
        session.setAttribute("login", true);
        response.sendRedirect("message.jsp");
    }
%>
</body>
</html>
