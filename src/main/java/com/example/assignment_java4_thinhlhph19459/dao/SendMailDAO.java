package com.example.assignment_java4_thinhlhph19459.dao;

import com.example.assignment_java4_thinhlhph19459.common.Sendmail;
import com.example.assignment_java4_thinhlhph19459.model.UserEntity;
import jakarta.servlet.ServletContext;

public class SendMailDAO {
    private static final String EMAIL_WELCOME_SUBJECT = "Welcome to Mytube";
    private static final String EMAIL_FORGOT = "Your-new passwword";

    public void sendmail(ServletContext context, UserEntity recipient, String type){
       String host = context.getInitParameter("host");
       String port = context.getInitParameter("port");
       String user = context.getInitParameter("user");
       String pass = context.getInitParameter("pass");

       try{
            String subject = null;
            String content = null;
            switch (type){
                case "welcome" :
                    subject = EMAIL_WELCOME_SUBJECT;
                    content = "Dear " + recipient.getFullname() + ", Wish you have a good time with Mytube";
                    break;
                case "forgot" :
                    subject = EMAIL_FORGOT;
                    content = "Your new pass here: " + recipient.getPassword();
                    break;
                default:
                    subject = "Somethings went wrong!";
                    content = "Don't care about it";
            }
            Sendmail.sendEmail(host,port,user,pass,recipient.getEmail(), subject,  content);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
