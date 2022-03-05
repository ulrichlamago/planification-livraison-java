package application;

import java.util.Properties;


import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.mail.*;

public class MailClass {
	
	
	public MailClass(){
		
	}
	
	  public void EnvoyerEmail(String adressemail,String motdepasse){
		  String username = "ulrichkamajong@gmail.com";
		 String  password = "";
		
		 
		  Properties propriete = new Properties();
		  propriete.put("mail.smtp.auth", "true");
		  propriete.put("mail.smtp.starttls.enable","true");
		  propriete.put("mail.smtp.host","smtp.gmail.com");
		  propriete.put("mail.smtp.port","587");
		
		  Authenticator monidentifi=new Authenticator(){ protected PasswordAuthentication getPasswordAuthentication() {
			  return new PasswordAuthentication(username, password);}};
		  Session session = Session.getInstance(propriete,monidentifi);
		  try {
		 
		  Message message = new MimeMessage(session);
		  message.setFrom(new InternetAddress("ulrichkamajong@gmail.com"));
		  message.setRecipients(Message.RecipientType.TO,
		  InternetAddress.parse(adressemail));
		  message.setSubject("mot de passe oublier");
		  message.setText("votre mot de passe est: " +motdepasse);
		  
		  Transport.send(message);
		  JOptionPane.showMessageDialog(null,"votre mot de passe vous à ete envoyer avec succès");
		  } catch (MessagingException e) {
		 JOptionPane.showMessageDialog(null, "veuillez saisir un adresse email correct","echec de l'envoi",  JOptionPane.ERROR_MESSAGE);
		   }}

}
