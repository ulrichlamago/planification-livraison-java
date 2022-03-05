package application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class FenetreConnexion extends JFrame{
	JLabel connection;
	JLabel login;
	JLabel password;
private	JTextField textlogin;
private   JPasswordField textpassword;
   JButton connecter;
   JButton inscrire;
    public FenetreConnexion(){
    	connection=new JLabel("veuillez vouz connectez");
    	login=new JLabel("login:");
    	password=new JLabel("mots de passe:");
    	textlogin=new JTextField();
    	textpassword=new JPasswordField();
    	connecter=new JButton("connextion");
    	inscrire=new JButton("s'inscrire");
    	Font ft=new Font("arial",Font.BOLD,16);
    	connection.setFont(new Font("arial",Font.BOLD,30));
    	login.setFont(new Font("arial",Font.BOLD,15));
    	password.setFont(new Font("arial",Font.BOLD,15));
    	JPanelBack jp0=new JPanelBack("src/application/test.png");
    	JPanel jp=new JPanel();
        jp.setOpaque(false); 
    	GridLayout gl=new GridLayout(3,2,15,15);
    	jp.setLayout(gl);
    	jp.add(login);
    	jp.add(textlogin);
    	jp.add(password);
    	jp.add(textpassword);    	
    	jp.add(inscrire);
    	jp.add(connecter);
    	jp0.setLayout(new GridLayout(2,1,15,30));    	
    	jp0.add(connection);
    	jp0.add(jp);
    	this.setContentPane(jp0);
    	this.pack();
    }
    
}
