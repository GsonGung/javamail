<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>发送失败</title>
  </head>
  
  <body>
      抱歉，发送邮件失败 ！点<a href="sendMail.jsp"><b>这里</b></a>回去重新发一封。
  </body>
</html>
