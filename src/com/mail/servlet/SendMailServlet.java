package com.mail.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.mail.MailSenderInfo;
import com.util.mail.SimpleMailSender;

public class SendMailServlet extends HttpServlet {

	private static final long serialVersionUID = 3481887036605799736L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//设置字符编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//从页面获取参数
		String userName = request.getParameter("username");
		String serverHost = request.getParameter("serverhost");
		String password =request.getParameter("password");
		String toAddress =request.getParameter("toaddress");
		String subject =request.getParameter("subject");
		String content =request.getParameter("content");
		
		//发送方邮箱SMTP服务器地址
		String mailServerHost = "smtp." + serverHost;
		
		//发送方邮箱SMTP服务器的端口, qq.com、163.com、126.com、sina.com、sohu.com等的端口号都为25  
		String mailServerPort = "25";
		
		//如果前台页面中需要添加邮箱类型，如gmail.com，则这里可以添加以下语句处理
		//if(serverHost.equals("gmail.com"))
		//{
		//    mailServerPort = "587";
		//}
		
		//发送方的邮箱账号
		userName = userName + "@" + serverHost;
        //测试获取到的用户名是否正确
		System.out.println(userName);
		
		//发送方的邮箱地址
		String fromAddress = userName;
		//测试获取到的用户名是否正确
	    System.out.println(fromAddress);

		//这个类主要是设置邮件  
	     MailSenderInfo mailInfo = new MailSenderInfo();
	        //服务器与端口的对应关系：  smtp.qq.com -> 25或587    smtp.163.com -> 25
	     mailInfo.setMailServerHost(mailServerHost); //发送方的SMTP服务器地址  
	     mailInfo.setMailServerPort(mailServerPort);   //发送方SMTP服务器端口
	     mailInfo.setValidate(true);   //设置SMTP服务器需要身份验证
	     mailInfo.setUserName(userName);  //发送方邮箱账号 
	     mailInfo.setPassword(password);  //发送方邮箱密码   
	     mailInfo.setFromAddress(fromAddress);   //发送方邮箱地址
	     mailInfo.setToAddress(toAddress);    //接收方邮箱地址
	     mailInfo.setSubject(subject);   //邮件标题
	     mailInfo.setContent(content);    //邮件内容 
	     
	     //这个类主要来发送邮件     
	     //SimpleMailSender sms = new SimpleMailSender();    
	     boolean flag = false;  
	     flag = SimpleMailSender.sendHtmlMail(mailInfo);//发送html格式    
	     //如果邮件发送成功，则跳转到success.jsp页面；否则，跳转到fail.jsp页面
	     if(flag)
	     {   
	         System.out.println("发送html格式mail 成功！");
		     response.sendRedirect("success.jsp");
	     }
	     else 
	     {
	         System.out.println("发送html格式mail 失败！");
		     response.sendRedirect("fail.jsp");
		 }

	}

}
