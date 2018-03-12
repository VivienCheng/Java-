<%--
  Created by IntelliJ IDEA.
  User: leehaoze
  Date: 2018/1/8
  Time: 下午8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login</title>
  </head>
  <body>
    <form action="/check">
      <table>
        <tr><td>用户名</td><td><input type="text" name="username"></td></tr>
        <tr><td>密码</td><td><input type="password" name="password"></td></tr>
        <tr><button type="submit">提交</button></tr>
      </table>
    </form>
  </body>
</html>
