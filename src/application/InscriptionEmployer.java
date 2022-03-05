package application;

import javax.swing.JFrame;

import com.toedter.calendar.JCalendar;

import interaction.ActionEmployer;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class InscriptionEmployer extends JFrame {
private	   JLabel nom;
public JLabel getNom() {
	return nom;
}
public void setNom(JLabel nom) {
	this.nom = nom;
}
public JLabel getPrenom() {
	return prenom;
}
public void setPrenom(JLabel prenom) {
	this.prenom = prenom;
}
public JTextField getTextnom() {
	return textnom;
}
public void setTextnom(JTextField textnom) {
	this.textnom = textnom;
}
public JTextField getTextprenom() {
	return textprenom;
}
public void setTextprenom(JTextField textprenom) {
	this.textprenom = textprenom;
}
public JLabel getLogin() {
	return login;
}
public void setLogin(JLabel login) {
	this.login = login;
}
public JTextField getTextlogin() {
	return textlogin;
}
public void setTextlogin(JTextField textlogin) {
	this.textlogin = textlogin;
}
public JLabel getPassword() {
	return password;
}
public void setPassword(JLabel password) {
	this.password = password;
}
public JPasswordField getTextpassword() {
	return textpassword;
}
public void setTextpassword(JPasswordField textpassword) {
	this.textpassword = textpassword;
}
public JButton getAnnuler() {
	return annuler;
}
public void setAnnuler(JButton annuler) {
	this.annuler = annuler;
}
public JButton getEnregistrer() {
	return enregistrer;
}
public void setEnregistrer(JButton enregistrer) {
	this.enregistrer = enregistrer;
}
public JLabel getPoste() {
	return poste;
}
public void setPoste(JLabel poste) {
	this.poste = poste;
}
public JLabel getEmail() {
	return email;
}
public void setEmail(JLabel email) {
	this.email = email;
}
public JTextField getTextemail() {
	return textemail;
}
public void setTextemail(JTextField textemail) {
	this.textemail = textemail;
}
public JComboBox getComboposte() {
	return comboposte;
}
public void setComboposte(JComboBox comboposte) {
	this.comboposte = comboposte;
}
public JLabel getSal() {
	return sal;
}
public void setSal(JLabel sal) {
	this.sal = sal;
}
public JTextField getSalaire() {
	return salaire;
}
public void setSalaire(JTextField salaire) {
	this.salaire = salaire;
}
public JLabel getDat() {
	return dat;
}
public void setDat(JLabel dat) {
	this.dat = dat;
}
public JCalendar getDate() {
	return date;
}
public void setDate(JCalendar date) {
	this.date = date;
}
private	   JLabel prenom;
private	   JTextField textnom;
private	   JTextField textprenom;
private	   JLabel login;
private	   JTextField textlogin;
private	   JLabel password;
private	   JPasswordField textpassword;
private    JButton annuler;
private    JButton enregistrer;
private    JLabel poste;
private    JLabel email;
private    JTextField textemail;
private    JComboBox comboposte;
private    JLabel sal;
private    JTextField salaire;
private    JLabel dat;
private    JCalendar date;
private    PaneEmployer pa;
   public InscriptionEmployer(PaneEmployer pa){
	   this.pa=pa;
	   nom=new JLabel("NOM");
	   prenom=new JLabel("PRENOM:");
	  login= new JLabel("login:");
	  password=new JLabel("mots de passe:");
	  poste=new JLabel("poste");
	  email=new JLabel("adresse email");
	  textnom=new JTextField();
	  textprenom=new JTextField();
	  textlogin=new JTextField();
	  textpassword=new JPasswordField();
	  textemail=new JTextField();
	  sal=new JLabel("salaire:");
	  salaire=new JTextField();
	  comboposte=new JComboBox();
	  comboposte.addItem("chauffeur");
	  comboposte.addItem("comptable");
	  comboposte.addItem("secretaire");
	  ActionEmployer AE=new ActionEmployer(this);
	  enregistrer=new JButton("enregistrer");
	  enregistrer.addActionListener(AE);
	  annuler=new JButton("annuler");
	  annuler.addActionListener(AE);
	  JPanel jp=new JPanel();
	  GridLayout gl=new GridLayout(9,2,20,20);
	  jp.setLayout(gl);
	  JLabel titre=new JLabel("ajouter un employer:");
	  titre.setFont(new Font("arial",Font.BOLD,30));
	  nom.setFont(new Font("arial",Font.BOLD,15));
	  prenom.setFont(new Font("arial",Font.BOLD,15));
	  login.setFont(new Font("arial",Font.BOLD,15));
	  password.setFont(new Font("arial",Font.BOLD,15));
	  poste.setFont(new Font("arial",Font.BOLD,15));
	  email.setFont(new Font("arial",Font.BOLD,15));
	  JPanel jp0=new JPanelBack("src/application/inscription.jpg");
	  this.setSize(500, 420);
      this.setResizable(false);	  
	  jp.setOpaque(false);
	  Color cl=new Color(0,64,0);
	  titre.setForeground(Color.WHITE);
	  enregistrer.setBackground(cl);
	  annuler.setBackground(cl);
      enregistrer.setForeground(Color.WHITE);
      annuler.setForeground(Color.WHITE);
      nom.setForeground(Color.WHITE);
      prenom.setForeground(Color.WHITE);
      login.setForeground(Color.WHITE);
      password.setForeground(Color.WHITE);
      poste.setForeground(Color.WHITE);
      email.setForeground(Color.WHITE);
	  comboposte.setForeground(cl);
	  comboposte.setBackground(Color.WHITE);
	  sal.setForeground(Color.WHITE);
	 
	  jp.add(nom);
	  jp.add(textnom);
	  jp.add(prenom);
	  jp.add(textprenom);
	  jp.add(login);
	  jp.add(textlogin);
	  jp.add(password);
	  jp.add(textpassword);
	  
	  jp.add(poste);
	  jp.add(comboposte);
	  jp.add(sal);
	  jp.add(salaire);
	  jp.add(email);
	  jp.add(textemail);
	  jp.add(enregistrer);
	 jp.add(annuler);
	 jp0.add(titre);
	 jp0.add(jp);
	 this.setContentPane(jp0);
	
	   
	   
   }
public PaneEmployer getPa() {
	return pa;
}
public void setPa(PaneEmployer pa) {
	this.pa = pa;
}
    
	

}
