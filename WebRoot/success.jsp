<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>发送成功 </title>
  </head>
  
  <body>
    恭喜，发送邮件成功 ！点<a href="sendMail.jsp">这里</a>回去再发一封。
  </body>
</html>
