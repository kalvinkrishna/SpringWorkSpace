package org.spring.controller;

import java.util.List;

import org.spring.MailDal;
import org.spring.mail.models.Mail;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value="/")
public class MailController {
	
	private final MailDal maildal;
	
	public MailController(MailDal mail) {
		this.maildal = mail;
	}
	
	@RequestMapping(value="", method= RequestMethod.GET)
	public List<Mail> getAllMails(){
		return maildal.getAllMail();
	}
	
	@RequestMapping(value="/delete", method= RequestMethod.POST)
	public ResponseEntity<Mail> deleteMailFromList(String idMail) {
		HttpHeaders responseHeader = new HttpHeaders();
		return null;
	}
}
