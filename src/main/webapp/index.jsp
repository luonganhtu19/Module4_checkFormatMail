<%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 1/22/2021
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Email Validation</title>
  </head>
  <body>
        <h1>Email Validation</h1>
        <h3 style="color: red">${message}</h3>
        <form action="/validate" method="post">
          <input type="text" name="email"><br>
          <input type="submit" name="Validate">
        </form>
  </body>
</html>
