
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>check</title>
</head>
<body>
    <%
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       session.setAttribute("username",username);
       if(username.equals("zhangsan") && password.equals("1234")){
           response.sendRedirect("final.jsp");
       }
       else{
           out.print("用户名或密码不正确");
       }
    %>
</body>
</html>
