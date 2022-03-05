package structure;

import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import DAO.DataBase;
import net.proteanit.sql.DbUtils;

public class InfosClient {
	public static void remplir(JTable table){
		try{
			String query="SELECT * FROM client ;";
			Statement req=DataBase.connect().prepareStatement(query);			
			ResultSet resultat=req.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(resultat));
			
			
		}catch(Exception ex){
			System.out.println("erreur requète");
		}
		
	}

	public static void ajouterClient(String nom,String prenom,String ville,String adresse,String email){
		try{
		Statement state=DataBase.connect().createStatement();
		String sql="INSERT INTO client(nom_client,prenom_client,ville_client,adresse_client,email_client) values('"+nom+"','"+prenom+"','"+ville+"','"+adresse+"','"+email+"');";
		state.executeUpdate(sql);}catch(Exception ex){
			System.out.println("l'ajout n'a pas éte effectuer");
			
		}
	}
	public static void supprimer(int id){
		try{
			Statement state=DataBase.connect().createStatement();
			String sql="DELETE FROM client WHERE id_client="+id+" ;";
			state.executeUpdate(sql);}catch(Exception ex){
				System.out.println("erreur");
				
			}
		
	}
	public static int rechercher(String nom,JTable table){
		int id=-1;
	
	try{
		String sql="SELECT * FROM client WHERE nom_client='"+nom+"' ;";
		Statement state=DataBase.connect().prepareStatement(sql);
		ResultSet resultat=state.executeQuery(sql);
		resultat.next();
		if(resultat!=null){
	int pa=Integer.parseInt(resultat.getString("id_client"));
	int i;
	for(i=0;i<table.getRowCount();i++){
		if(table.getValueAt(i, 0).equals(pa)){
			return i;
		}
	}}
		
		return id;
		
		}catch(Exception ex){
			System.out.println("erreur");
	}
	return id;

}
	public static void modifier(int id_client,String nom,String prenom,String ville,String adresse,String email){
		try{
			Statement state=DataBase.connect().createStatement();
			String sql="UPDATE client SET nom_client='"+nom+"' , prenom_client='"+prenom+"' , ville_client='"+ville+"' , adresse_client='"+adresse+"' , email_client='"+email+"' WHERE id_client="+id_client+" ;";
			state.executeUpdate(sql);}catch(Exception ex){
				System.out.println("erreur");
				
			}
		
	}
}
