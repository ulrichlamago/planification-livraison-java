package interaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import DAO.DataBase;
import application.Client;
import structure.InfosClient;

public class ActionClient implements ActionListener {
	Client cli;
	public ActionClient(Client cli){
		this.cli=cli;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(cli.getAjouter())){
		String ville=(String)cli.getVille().getSelectedItem();
		InfosClient.ajouterClient(cli.getNom().getText(), cli.getPrenom().getText(), ville, cli.getAdresse().getText(), cli.getEmail().getText());
		JOptionPane.showMessageDialog(null, "ce client à éte enregistrer avec succès");
		InfosClient.remplir(cli.getPaneclient().getTable());
		cli.dispose();
		// TODO Auto-generated method stub

	}else{
	cli.dispose();
	}
	
	}
}
