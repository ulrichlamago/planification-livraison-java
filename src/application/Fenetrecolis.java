package application;

import com.toedter.calendar.JCalendar;

import interaction.ActionColis;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class Fenetrecolis extends JFrame {
private	JLabel NomExpediteur;
private	JLabel NomDestinataire;
private	JLabel NomDuColis;
private	JLabel quantité;
private	JLabel AdresseDestinataire;
private	JLabel VilleDestinataire;
private	JLabel Teldestinataire;
private	JLabel FraisLivraison;
private	JTextField NomEx;
private	JTextField NomDes;
private JTextField colis;
private JTextField quantite;
private JTextField adresseDes;
private JTextField villedes;
private JTextField tel;
private JTextField frais;
private JButton ajouter;
private JButton annuler;
private PaneColis pc;

private JPanel jp;
private JLabel img;
private JPanel pane;


	
	public JLabel getImg() {
	return img;
}



public void setImg(JLabel img) {
	this.img = img;
}



public JPanel getPane() {
	return pane;
}



public void setPane(JPanel pane) {
	this.pane = pane;
}



public void setPc(PaneColis pc) {
	this.pc = pc;
}



	public Fenetrecolis(PaneColis pc){
		this.pc=pc;
		jp=new JPanel();
		NomExpediteur=new JLabel("nom de l'expéditeur:");
		NomExpediteur.setForeground(new Color(0,128,0));
		NomDestinataire=new JLabel("nom du destinataire:");
		NomDestinataire.setForeground(new Color(0,128,0));
		NomDuColis=new JLabel("nom du colis:");
		NomDuColis.setForeground(new Color(0,128,0));
		quantité=new JLabel("quantité:");
		quantité.setForeground(new Color(0,128,0));
		AdresseDestinataire=new JLabel("Adresse du destinataire:");
		AdresseDestinataire.setForeground(new Color(0,128,0));
		VilleDestinataire=new JLabel("ville du destinataire:");
		VilleDestinataire.setForeground(new Color(0,128,0));
		Teldestinataire=new JLabel("tel du destinataire");
		Teldestinataire.setForeground(new Color(0,128,0));
		FraisLivraison=new JLabel("frais de livraison");
		FraisLivraison.setForeground(new Color(0,128,0));
		NomEx=new JTextField();
		NomDes=new JTextField();
		colis=new JTextField();
		quantite=new JTextField();
		adresseDes=new JTextField();
		villedes=new JTextField();
		tel=new JTextField();
		frais=new JTextField();
		GridLayout gl=new GridLayout(10,2,15,15);
		ActionColis ac=new ActionColis(this);
		ajouter=new JButton("ajouter");
		ajouter.setBackground(Color.WHITE);
		ajouter.setForeground(new Color(0,128,0));
		ajouter.addActionListener(ac);
		annuler=new JButton("annuler");
		annuler.setBackground(Color.WHITE);
		annuler.setForeground(new Color(0,128,0));
		annuler.addActionListener(ac);
		
		jp.setLayout(gl);
		jp.add(NomExpediteur);
		jp.add(NomEx);
		jp.add(NomDestinataire);
		jp.add(NomDes);
		jp.add(VilleDestinataire);
		jp.add(villedes);
		jp.add(AdresseDestinataire);
		jp.add(adresseDes);	
		jp.add(Teldestinataire);
		jp.add(tel);
		jp.add(NomDuColis);
		jp.add(colis);
		jp.add(quantité);
		jp.add(quantite);
		jp.add(FraisLivraison);
		jp.add(frais);
		jp.add(ajouter);
		jp.add(annuler);
		img=new JLabel(new ImageIcon("src/application/colis.jpg"));
		pane=new JPanel();
		GridLayout af=new GridLayout(1,2,10,10);
		pane.setLayout(af);
		pane.add(img);
		pane.add(jp);
		JPanel contenant=new JPanel();
		JLabel titre=new JLabel("enregistrer un nouveau colis");
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		titre.setForeground(new Color(0,128,0));
	    
		contenant.setBackground(Color.WHITE);
		contenant.add(titre);
		contenant.add(pane);
		pane.setBackground(Color.WHITE);
		jp.setBackground(Color.WHITE);
		jp.setForeground(new Color(0,128,0));
		this.setContentPane(contenant);
		this.pack();
		this.setBackground(new Color(196,218,165));
		this.setSize(1000, 500);
		this.setResizable(false);
		this.setVisible(true);
	}



	public PaneColis getPc() {
		return pc;
	}



	public JLabel getNomExpediteur() {
		return NomExpediteur;
	}



	public void setNomExpediteur(JLabel nomExpediteur) {
		NomExpediteur = nomExpediteur;
	}



	public JLabel getNomDestinataire() {
		return NomDestinataire;
	}



	public void setNomDestinataire(JLabel nomDestinataire) {
		NomDestinataire = nomDestinataire;
	}



	public JLabel getNomDuColis() {
		return NomDuColis;
	}



	public void setNomDuColis(JLabel nomDuColis) {
		NomDuColis = nomDuColis;
	}



	public JLabel getQuantité() {
		return quantité;
	}



	public void setQuantité(JLabel quantité) {
		this.quantité = quantité;
	}



	public JLabel getAdresseDestinataire() {
		return AdresseDestinataire;
	}



	public void setAdresseDestinataire(JLabel adresseDestinataire) {
		AdresseDestinataire = adresseDestinataire;
	}



	public JLabel getVilleDestinataire() {
		return VilleDestinataire;
	}



	public void setVilleDestinataire(JLabel villeDestinataire) {
		VilleDestinataire = villeDestinataire;
	}



	public JLabel getTeldestinataire() {
		return Teldestinataire;
	}



	public void setTeldestinataire(JLabel teldestinataire) {
		Teldestinataire = teldestinataire;
	}



	public JLabel getFraisLivraison() {
		return FraisLivraison;
	}



	public void setFraisLivraison(JLabel fraisLivraison) {
		FraisLivraison = fraisLivraison;
	}



	public JTextField getNomEx() {
		return NomEx;
	}



	public void setNomEx(JTextField nomEx) {
		NomEx = nomEx;
	}



	public JTextField getNomDes() {
		return NomDes;
	}



	public void setNomDes(JTextField nomDes) {
		NomDes = nomDes;
	}



	public JTextField getColis() {
		return colis;
	}



	public void setColis(JTextField colis) {
		this.colis = colis;
	}



	public JTextField getQuantite() {
		return quantite;
	}



	public void setQuantite(JTextField quantite) {
		this.quantite = quantite;
	}



	public JTextField getAdresseDes() {
		return adresseDes;
	}



	public void setAdresseDes(JTextField adresseDes) {
		this.adresseDes = adresseDes;
	}



	public JTextField getVilledes() {
		return villedes;
	}



	public void setVilledes(JTextField villedes) {
		this.villedes = villedes;
	}



	public JTextField getTel() {
		return tel;
	}



	public void setTel(JTextField tel) {
		this.tel = tel;
	}



	public JTextField getFrais() {
		return frais;
	}



	public void setFrais(JTextField frais) {
		this.frais = frais;
	}



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



	public JPanel getJp() {
		return jp;
	}



	public void setJp(JPanel jp) {
		this.jp = jp;
	}
	

}
