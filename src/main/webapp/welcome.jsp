<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/17
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎：${loginuser.userName};${loginOut}
<a href="/user/loginOut">退出登陆</a><br>
<a href="/user/saleProduct">销售</a><br>
<a href="#">销售信息查询</a><br>
<a href="#">查看库存</a><br>


<iframe src="${url}" width="1000" height="800">

</iframe>
<%--<div id="detail1" style="border: 1px solid red;width: 900px;height: 580px"></div>--%>

</body>
</html>
