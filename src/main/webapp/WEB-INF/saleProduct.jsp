<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/17
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="/user/">
    添加销售：
    商品名称：<select>
         <c:forEach items="" var="item">
             <option>${item}</option>
         </c:forEach>
              </select><br>
    销售单价：<input  /><br>
    销售数量：<input /><br>
    <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
