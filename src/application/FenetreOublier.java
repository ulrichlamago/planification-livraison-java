package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interaction.OubliClik;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FenetreOublier extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JTextField adresse;
	private JButton envoyer; 
	private JButton retour;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreOublier frame = new FenetreOublier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public JTextField getLogin() {
		return login;
	}

	public void setLogin(JTextField login) {
		this.login = login;
	}

	public JTextField getAdresse() {
		return adresse;
	}

	public void setAdresse(JTextField adresse) {
		this.adresse = adresse;
	}

	public JButton getEnvoyer() {
		return envoyer;
	}

	public void setEnvoyer(JButton envoyer) {
		this.envoyer = envoyer;
	}

	/**
	 * Create the frame.
	 */
	public FenetreOublier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		OubliClik oc=new OubliClik(this);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("vous avez oubliez votre mots de passe");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(62, 21, 294, 59);
		panel.add(lblNewLabel);
		
		JLabel lblVeuillezSaisirVotre = new JLabel("veuillez saisir votre adresse mail:");
		lblVeuillezSaisirVotre.setForeground(new Color(0, 128, 0));
		lblVeuillezSaisirVotre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVeuillezSaisirVotre.setBounds(10, 153, 195, 27);
		panel.add(lblVeuillezSaisirVotre);
		
		JLabel lblLogin = new JLabel("login:");
		lblLogin.setForeground(new Color(0, 128, 0));
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLogin.setBounds(159, 128, 46, 14);
		panel.add(lblLogin);
		
		JLabel lblUneAdresseMail = new JLabel("une adresse mail va vous \u00E8tre envoyer");
		lblUneAdresseMail.setForeground(new Color(0, 128, 0));
		lblUneAdresseMail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUneAdresseMail.setBounds(62, 80, 260, 19);
		panel.add(lblUneAdresseMail);
		
		login = new JTextField();
		login.setBounds(236, 126, 120, 20);
		panel.add(login);
		login.setColumns(10);
		
		envoyer = new JButton("envoyer");
		envoyer.addMouseListener(oc);
		envoyer.setBackground(new Color(255, 255, 255));
		envoyer.setForeground(new Color(0, 128, 0));
		envoyer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		envoyer.setBounds(92, 211, 113, 23);
		panel.add(envoyer);
		
		adresse = new JTextField();
		adresse.setBounds(236, 157, 120, 20);
		panel.add(adresse);
		adresse.setColumns(10);
		
		retour = new JButton("retour");
		retour.setForeground(new Color(0, 128, 0));
		retour.setFont(new Font("Tahoma", Font.PLAIN, 14));
		retour.setBackground(Color.WHITE);
		retour.setBounds(243, 213, 113, 23);
		retour.addMouseListener(oc);
		panel.add(retour);
	}

	public JButton getRetour() {
		return retour;
	}

	public void setRetour(JButton retour) {
		this.retour = retour;
	}
}
