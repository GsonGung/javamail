<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>发送邮件</title>
    <style type="text/css">
       .label{
                float: left;
                width: 200px;
                text-align: right;
             }
       .b{color: red;}
    </style>
  </head>
  
  <body>
  <form action="SendMailServlet" method="post">
     <p><label>请登录您的邮箱</label></p>
     <label class="label"><b class="b">*</b>&nbsp;邮箱账号:</label>&nbsp;&nbsp;<input type="text" name="username" size="30" maxlength="25" />
     
     <select name="serverhost">
         <option value="qq.com">@qq.com</option>
         <option value="163.com">@163.com</option>
         <option value="sina.com">@sina.com</option>      
         <option value="sohu.com">@sohu.com</option>         
         <option value="126.com">@126.com</option>
     </select>
     <br />
     <label class="label"><b class="b">*</b>&nbsp;邮箱密码:</label>&nbsp;&nbsp;<input type="password" name="password" size="30" maxlength="25" /><br />
     <label class="label"><b class="b">*</b>&nbsp;收件人邮箱:</label>&nbsp;&nbsp;<input type="text" name="toaddress" size="30" maxlength="25" /><br />
     <label class="label">邮件标题:</label>&nbsp;&nbsp;<input type="text" name="subject" size="100" maxlength="200" /><br />
     <label class="label">邮件内容:</label>&nbsp;&nbsp;<textarea name="content" rows="15" cols="85"></textarea><br />
     <label class="label"><input type="submit" value="发送" /></label>
  </form>
  
  </body>
</html>
