package structure;

import java.sql.*;
import java.util.Calendar;

import javax.swing.JTable;

import DAO.DataBase;
import net.proteanit.sql.DbUtils;

public class InfosColis {
	public static void remplir(JTable table){
		try{
			String query="SELECT * FROM colis ;";
			Statement req=DataBase.connect().prepareStatement(query);			
			ResultSet resultat=req.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(resultat));
			
			
		}catch(Exception ex){
			System.out.println("erreur requète");
		}
		
	}

	public static void ajouterColis(String nom_colis,String nom_expediteur,int id_expediteur,String ville_expediteur,String nom_destinataire,String ville_destinataire,String tel_destinataire,String date,int quantit){
	
		try{
		Statement state=DataBase.connect().createStatement();
	String sql="INSERT INTO colis(nom_colis, nom_expediteur, id_expediteur, ville_expediteur, nom_destinataire, ville_destinataire, tel_destinataire, date_envoi, statut, quantité) values('"+nom_colis+"' ,'"+nom_expediteur+"',"+id_expediteur+",'"+ville_expediteur+"','"+nom_destinataire+"','"+ville_destinataire+"','"+tel_destinataire+"','"+date+"','en attente',15);";
		state.executeUpdate(sql);}catch(Exception ex){
			System.out.println("erreur requète");
			
		}
		
	}
	public static void supprimer(int id_colis){
		try{
			Statement state=DataBase.connect().createStatement();
			String sql="DELETE FROM colis WHERE id_colis="+id_colis+";";
			state.executeUpdate(sql);}catch(Exception ex){
				System.out.println("erreur");
				
			}
		
	}
	public static int rechercher(String nom,JTable table){
		int id=-1;
	
	try{
		Statement state=DataBase.connect().createStatement();
		String sql="SELECT id_colis FROM colis WHERE nom_colis='"+nom+"' ;";
		ResultSet resultat=state.executeQuery(sql);
		resultat.next();
		if(resultat!=null){
		int parse=Integer.parseInt(resultat.getString("id_colis"));
		int i;
		for(i=0;i<table.getRowCount();i++){
			if(table.getValueAt(i, 0).equals(parse)){
				return i;
			}
		}}
		}catch(Exception ex){
			System.out.println("erreur");
	}
	return id;

}
	public static void modifier(int id_colis,String nom_colis,String nom_expediteur,int id_expediteur,String ville_expediteur,String nom_destinataire,String ville_destinataire,String tel_destinataire,String date,String statut,int quantit){
		try{
			Statement state=DataBase.connect().createStatement();
			String sql="UPDATE colis SET nom_colis='"+nom_colis+"' , nom_expediteur='"+nom_expediteur+"' , id_expediteur="+id_expediteur+" , ville_expediteur='"+ville_expediteur+"' , nom_destinataire='"+nom_destinataire+"' , ville_destinataire='"+ville_destinataire+"' , tel_destinataire='"+tel_destinataire+"' , date_envoi='"+date+"' , statut='"+statut+"' , quantité="+quantit+" WHERE id_colis="+id_colis+"; ";
			state.executeUpdate(sql);}catch(Exception ex){
				System.out.println("erreur sur la requète");
				
			}
		
	}

}
