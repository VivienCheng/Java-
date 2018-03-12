<%--
  Created by IntelliJ IDEA.
  User: leehaoze
  Date: 2018/1/8
  Time: 下午8:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
add info
<form action="/InsertServlet">
    <table>
        <tr>
            <td>名称：</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>

        <tr>
            <td>价格：</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>厂商：</td>
            <td><input type="text" name="from"></td>
        </tr>

        <tr>
            <button type="submit">Submit</button>
        </tr>
    </table>
</form>
</body>
</html>
