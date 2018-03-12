<%@ page import="web.Product" %><%--
  Created by IntelliJ IDEA.
  User: leehaoze
  Date: 2018/1/8
  Time: 下午8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addfinish</title>
</head>
<body>
<jsp:useBean id="products" class="web.Products" scope="application"></jsp:useBean>
<table>
<%
    for (Product product : products.getProducts()) {
        out.print("<tr>");
        out.print("<td>");
        out.print("ID");
        out.print("</td>");
        out.print("<td>");
        out.print(product.getId_());
        out.print("</td>");

        out.print("<td>");
        out.print("Name");
        out.print("</td>");
        out.print("<td>");
        out.print(product.getName_());
        out.print("</td>");

        out.print("<td>");
        out.print("Price");
        out.print("</td>");
        out.print("<td>");
        out.print(product.getPrice_());
        out.print("</td>");

        out.print("<td>");
        out.print("From");
        out.print("</td>");
        out.print("<td>");
        out.print(product.getForm_());
        out.print("</td>");
        out.print("</tr>");
    }
%>
    <form action="add.jsp">
        <button type="submit">返回</button>
    </form>
</table>
</body>
</html>
