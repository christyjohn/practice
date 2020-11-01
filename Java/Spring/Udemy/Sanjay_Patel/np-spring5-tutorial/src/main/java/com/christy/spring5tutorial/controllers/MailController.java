package com.christy.spring5tutorial.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.christy.spring5tutorial.mail.MailSender;

@RestController
public class MailController {

	private MailSender mailSender;
	
	public MailController(@Qualifier("smtpMail") MailSender smtp) {
		super();
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() {
		
		mailSender.send("mail@example.com", "A test mail", "Body of the test mail");
		return "Mail send";
	}
}
