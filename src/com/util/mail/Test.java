package com.util.mail;

public class Test {
	public static void main(String[] args){  
        //这个类主要是设置邮件  
     MailSenderInfo mailInfo = new MailSenderInfo();
        //服务器与端口的对应关系：  smtp.qq.com -> 587    smtp.163.com -> 25
     mailInfo.setMailServerHost("smtp.163.com"); //发送方的邮件服务器地址  
     mailInfo.setMailServerPort("25");   //发送方SMTP服务器端口
     mailInfo.setValidate(true);   //设置SMTP服务器需要身份验证
     mailInfo.setUserName("18316022546@163.com");  //发送方邮箱账号 
     mailInfo.setPassword("xxxxxxxxxxxx");  //发送方邮箱密码   
     mailInfo.setFromAddress("18316022546@163.com");   //发送方邮箱地址
     mailInfo.setToAddress("dgh18316022546@sina.com");    //接收方邮箱地址
     mailInfo.setSubject("java mail发送邮件的测试");   //邮件标题
     mailInfo.setContent("这是我在测试用java mail来发邮件");    //邮件内容 
     
     //这个类主要来发送邮件     
     //SimpleMailSender sms = new SimpleMailSender();    
     //boolean flag1 = false;
     //flag1 = sms.sendTextMail(mailInfo);//发送文体格式      
     //if(flag1)  
     //    System.out.println("发送文体格式mail 成功！");
     boolean flag2 = false;  
     flag2 = SimpleMailSender.sendHtmlMail(mailInfo);//发送html格式    
     if(flag2)  
         System.out.println("发送html格式mail 成功！");  
    
   }
}
