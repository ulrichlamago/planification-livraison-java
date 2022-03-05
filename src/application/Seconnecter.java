package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;

import interaction.ActionConnecter;
import interaction.OubliClik;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.SwingConstants;

public class Seconnecter extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JPasswordField password;
	private JLabel passeoublier;
	private JButton Annuler;
	private JButton connexion;
	private JLabel fermer;

	/**
	 * Launch the application.
	 
	
	}*/

	/**
	 * Create the frame.
	 */
	public Seconnecter() {
 
		setBounds(100, 100, 461, 372);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ActionConnecter ac=new ActionConnecter(this);
		OubliClik obc=new OubliClik(this);
		
		JPanel panel = new JPanelBack("src/application/test.png");
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(0, 0, 185, 342);
		contentPane.add(panel);
		
		fermer = new JLabel("X");
		fermer.setHorizontalAlignment(SwingConstants.CENTER);
		fermer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fermer.setFont(new Font("Tahoma", Font.BOLD, 20));
		fermer.setBounds(420, 0, 30, 14);
		fermer.addMouseListener(ac);
		contentPane.add(fermer);
		
		JLabel lblConnectezVous = new JLabel("connectez vous");
		lblConnectezVous.setForeground(new Color(0, 128, 0));
		lblConnectezVous.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConnectezVous.setBounds(228, 41, 185, 25);
		contentPane.add(lblConnectezVous);
		
		JLabel lblLogin = new JLabel("login:");
		lblLogin.setForeground(new Color(0, 128, 0));
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLogin.setBounds(197, 127, 46, 14);
		contentPane.add(lblLogin);
		
		login = new JTextField();
		login.setBounds(302, 126, 111, 20);
		contentPane.add(login);
		login.setColumns(10);
		
		JLabel lblMotsDePasse = new JLabel("mots de passe:");
		lblMotsDePasse.setForeground(new Color(0, 128, 0));
		lblMotsDePasse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMotsDePasse.setBounds(195, 187, 111, 14);
		contentPane.add(lblMotsDePasse);
		
		password = new JPasswordField();
		password.setBounds(302, 186, 111, 20);
		contentPane.add(password);
		
		passeoublier = new JLabel("mots de passe oubliez?");
		passeoublier.setForeground(new Color(0, 128, 0));
		passeoublier.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passeoublier.setBounds(203, 236, 134, 14);
		passeoublier.addMouseListener(obc);
		contentPane.add(passeoublier);
		
		connexion = new JButton("connection");
		connexion.setBackground(new Color(255, 255, 255));
		connexion.setForeground(new Color(0, 128, 0));
		connexion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		connexion.setBounds(195, 280, 100, 23);
		connexion.addActionListener(ac);
		contentPane.add(connexion);
		
		Annuler = new JButton("annuler");
		Annuler.setBackground(new Color(255, 255, 255));
		Annuler.setForeground(new Color(0, 128, 0));
		Annuler.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Annuler.setBounds(324, 280, 89, 23);
		Annuler.addActionListener(ac);
		contentPane.add(Annuler);
	}

	public JLabel getFermer() {
		return fermer;
	}

	public void setFermer(JLabel fermer) {
		this.fermer = fermer;
	}

	public JTextField getLogin() {
		return login;
	}

	public void setLogin(JTextField login) {
		this.login = login;
	}

	public JPasswordField getPassword() {
		return password;
	}

	public void setPassword(JPasswordField password) {
		this.password = password;
	}

	public JLabel getPasseoublier() {
		return passeoublier;
	}

	public void setPasseoublier(JLabel passeoublier) {
		this.passeoublier = passeoublier;
	}

	public JButton getAnnuler() {
		return Annuler;
	}

	public void setAnnuler(JButton annuler) {
		Annuler = annuler;
	}

	public JButton getConnexion() {
		return connexion;
	}

	public void setConnexion(JButton connexion) {
		this.connexion = connexion;
	}
}
