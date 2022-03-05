package structure;
import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import DAO.DataBase;
import net.proteanit.sql.DbUtils;

public class InfosTourner {
	public static void remplir(JTable table){
		try{
			String query="SELECT * FROM tourner ;";
			Statement req=DataBase.connect().prepareStatement(query);			
			ResultSet resultat=req.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(resultat));
			
			
		}catch(Exception ex){
			System.out.println("erreur requète");
		}
		
	}
	public  static void organiseztourner(String ville,JTable tab){
		try{
		String sql="SELECT nom_colis FROM colis where statut='en attente' and ville_destinataire='"+ville+"';";
		Statement state=DataBase.connect().prepareStatement(sql);
		ResultSet resultat=state.executeQuery(sql);
		tab.setModel(DbUtils.resultSetToTableModel(resultat));
		
		}catch(Exception ex){
			System.out.println("erreur");
		}
		
	}
	public static void chauffeur(JComboBox jc){
		try{
			String sql="SELECT nom from employer where poste='chauffeur' and  id not in (select id_chauffeur from tourner);;";
			Statement state=DataBase.connect().prepareStatement(sql);
			ResultSet resultat=state.executeQuery(sql);
			while(resultat.next()){
				jc.addItem(resultat.getString("nom"));
			}
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "erreur de requète", "erreur", JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void enregistertourner(String chauffeur,String ville,String date){
		try{
			int id=rechercherchauffeur(chauffeur);
			String sql="INSERT INTO tourner(ville_tourner,id_chauffeur,nom_chauffeur,date) values ('"+ville+"',"+id+",'"+chauffeur+"','"+date+"');";
			statutcolis(ville);
			Statement state=DataBase.connect().createStatement();
			state.executeUpdate(sql);
			
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "erreur de requète enregistrer tourner", "erreur", JOptionPane.ERROR_MESSAGE);;
		}
	}
	public static void statutcolis(String ville){
		try{
			String sql="Update colis SET statut='planifier' where ville_destinataire='"+ville+"';";
			Statement state=DataBase.connect().createStatement();
			state.executeUpdate(sql);
			
			
			
			}catch(Exception ex){
				System.out.println("erreur sur la requète statut colis");
			}
			
		
	}
	public static int rechercherchauffeur(String nom){
		
		try{
			String sql="SELECT id from employer where poste='chauffeur' and nom='"+nom+"' ;";
			Statement state=DataBase.connect().prepareStatement(sql);
			ResultSet resultat=state.executeQuery(sql);
			resultat.next();
			int id=Integer.parseInt(resultat.getString("id"));
			return id;
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "erreur de requète", "erreur", JOptionPane.ERROR_MESSAGE);
		}
		
		return -1;
	}

}
