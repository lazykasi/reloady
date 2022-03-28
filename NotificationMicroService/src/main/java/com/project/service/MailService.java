package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    
	@Autowired
	private JavaMailSender mailsender;
	
	public void Mailsender(String toEmail,String subject,String body) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("Kasi0507v@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		
		this.mailsender.send(message);
		
		System.out.println("Account have been created Successfully");
	}
}
