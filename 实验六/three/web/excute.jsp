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
    <title>excute</title>
</head>
<body>
<jsp:useBean id="products" class="web.Products" scope="application"></jsp:useBean>
    <%
        String name = (String)session.getAttribute("name");
        String price = (String)session.getAttribute("price");
        String from = (String)session.getAttribute("from");
        Product product = new Product(products.count(),name,Integer.parseInt(price),from);
        products.addProduct(product);
        response.sendRedirect("/addfinish.jsp");
    %>
</body>
</html>
