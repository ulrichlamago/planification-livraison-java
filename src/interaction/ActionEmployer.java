package interaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;

import javax.swing.JOptionPane;

import DAO.DataBase;
import application.InscriptionEmployer;
import structure.InfosEmployer;

public class ActionEmployer implements ActionListener {
	InscriptionEmployer IE;
	public ActionEmployer(InscriptionEmployer IE){
		this.IE=IE;
	}

	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(IE.getEnregistrer())){
		String nom=IE.getTextnom().getText();
		String prenom=IE.getTextprenom().getText();
		String email=IE.getTextemail().getText();
		String poste=String.valueOf(IE.getComboposte().getSelectedItem());
		String login=IE.getTextlogin().getText();
		String format = "dd/MM/yy";

		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format );
		java.util.Date date = new java.util.Date();
        String textdate=formater.format( date );
		int i;
		String Password="";
		for(i=0;i<IE.getTextpassword().getPassword().length;i++){
		Password=Password+(IE.getTextpassword().getPassword())[i];}
		try{
		int salaire=Integer.parseInt(IE.getSalaire().getText());
		if(InfosEmployer.exist(login)==true){
			JOptionPane.showMessageDialog(null, "ce login est déjà existant", "erreur", JOptionPane.ERROR_MESSAGE);
		}else{
			
		InfosEmployer.ajouterEmployer(nom, prenom, email, poste, salaire, textdate, login, Password);
		JOptionPane.showMessageDialog(null, "ajout effectuer avec succès");
		InfosEmployer.remplir(IE.getPa().getTable());
	
		IE.dispose();}
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "le salaire est donné en chiffre", "erreur de saisie", JOptionPane.ERROR_MESSAGE);
		}
	}else {
		IE.dispose();
	}
      
	}

}
