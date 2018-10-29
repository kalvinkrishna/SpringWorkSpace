package org.spring;

import java.util.List;

import org.spring.mail.models.Mail;

public interface MailDal {
	
	public List<Mail> getAllMail();
	public void sendMail();
	public void saveMail();
	public List<Mail> getLogMail();
	public void replyMail();
	public void AutoReplayMail();
	public Mail deleteMail(String idMail);
}
