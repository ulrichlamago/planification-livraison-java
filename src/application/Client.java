package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interaction.ActionClient;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Client extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JTextField prenom;
	private JTextField adresse;
	private JTextField email;
	private JComboBox ville;
	private JButton ajouter;
	private JButton annuler;
	private PaneClient paneclient;

	public JButton getAjouter() {
		return ajouter;
	}

	public void setAjouter(JButton ajouter) {
		this.ajouter = ajouter;
	}

	public JButton getAnnuler() {
		return annuler;
	}

	public void setAnnuler(JButton annuler) {
		this.annuler = annuler;
	}

	public JTextField getNom() {
		return nom;
	}

	public void setNom(JTextField nom) {
		this.nom = nom;
	}

	public JTextField getPrenom() {
		return prenom;
	}

	public void setPrenom(JTextField prenom) {
		this.prenom = prenom;
	}

	public JTextField getAdresse() {
		return adresse;
	}

	public void setAdresse(JTextField adresse) {
		this.adresse = adresse;
	}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JComboBox getVille() {
		return ville;
	}

	public void setVille(JComboBox ville) {
		this.ville = ville;
	}

	/**
	 * Launch the application.
	 */
	/*
	 public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the frame.
	 */
	public Client(PaneClient pc) {
		setTitle("enregistrer un client");
		this.paneclient=pc;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ActionClient ac=new ActionClient(this);
		setBounds(100, 100, 508, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(0, 0, 226, 451);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nouveau client");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(32, 112, 170, 98);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(225, 0, 267, 451);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("nom:");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 72, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblVeuillezRemplirLes = new JLabel("veuillez remplir les champs:");
		lblVeuillezRemplirLes.setBounds(24, 25, 176, 19);
		lblVeuillezRemplirLes.setForeground(new Color(0, 128, 0));
		lblVeuillezRemplirLes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblVeuillezRemplirLes);
		
		nom = new JTextField();
		nom.setBounds(96, 70, 148, 20);
		panel_1.add(nom);
		nom.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("prenom:");
		lblNewLabel_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 135, 64, 14);
		panel_1.add(lblNewLabel_2);
		
		prenom = new JTextField();
		prenom.setBounds(96, 133, 148, 20);
		panel_1.add(prenom);
		prenom.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ville:");
		lblNewLabel_3.setForeground(new Color(0, 128, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 198, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		ville=new JComboBox();
		ville.addItem("nabeul");
		ville.addItem("tunis");
		ville.addItem("sousse");
		ville.addItem("sfax");
		ville.setBounds(96, 196, 148,20);
		ville.setForeground(new Color(0, 128, 0));
		ville.setBackground(Color.WHITE);
		panel_1.add(ville);
		
		JLabel lblNewLabel_4 = new JLabel("adresse:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setForeground(new Color(0, 128, 0));
		lblNewLabel_4.setBounds(10, 256, 64, 14);
		panel_1.add(lblNewLabel_4);
		
		adresse = new JTextField();
		adresse.setBounds(96, 254, 148, 20);
		panel_1.add(adresse);
		adresse.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("email:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setForeground(new Color(0, 128, 0));
		lblNewLabel_5.setBounds(10, 302, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		email = new JTextField();
		email.setBounds(96, 300, 148, 20);
		panel_1.add(email);
		email.setColumns(10);
		
		ajouter = new JButton("ajouter");
		ajouter.addActionListener(ac);
		ajouter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ajouter.setBackground(new Color(255, 255, 255));
		ajouter.setForeground(new Color(0, 128, 0));
		ajouter.setBounds(10, 389, 89, 23);
		panel_1.add(ajouter);
		
		annuler = new JButton("annuler");
		annuler.setBackground(new Color(255, 255, 255));
		annuler.setFont(new Font("Tahoma", Font.PLAIN, 13));
		annuler.setForeground(new Color(0, 128, 0));
		annuler.setBounds(155, 389, 89, 23);
		annuler.addActionListener(ac);
		panel_1.add(annuler);
	}

	public PaneClient getPaneclient() {
		return paneclient;
	}

	public void setPaneclient(PaneClient paneclient) {
		this.paneclient = paneclient;
	}
}
