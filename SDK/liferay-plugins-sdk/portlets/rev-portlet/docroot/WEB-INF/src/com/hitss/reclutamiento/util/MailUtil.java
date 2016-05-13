package com.hitss.reclutamiento.util;

import java.io.UnsupportedEncodingException;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.util.mail.MailEngine;
import com.liferay.util.mail.MailEngineException;

public class MailUtil {

//	try {
//		MailUtil.sendMail("user2@globalhitss.com", "usuario 2", "user1@globalhitss.com", "Enviado Mensaje", "Cuerpo del mansaje");
//	} catch (AddressException | UnsupportedEncodingException | MailEngineException e) {
//		e.printStackTrace();
//	}

	public static void sendMail(String from, String altername, String to, String subject, String body) throws UnsupportedEncodingException, AddressException, MailEngineException {
		MailMessage mailMessage = new MailMessage();
		mailMessage.setHTMLFormat(true);
		mailMessage.setSubject(subject);
		mailMessage.setBody(body);

		mailMessage.setFrom(new InternetAddress(from, altername));
		mailMessage.setTo(new InternetAddress(to));
		MailEngine.send(mailMessage);
	}

	public static void sendMail(String from, String to, String subject, String body) throws UnsupportedEncodingException, AddressException, MailEngineException {
		sendMail(from, from, to, subject, body);
	}
	
	private MailUtil(){
		
	}

}
