package structure;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import DAO.DataBase;
import net.proteanit.sql.DbUtils;


public class InfosEmployer {
	public static void remplir(JTable table){
		try{
			String query="SELECT * FROM employer ;";
			Statement req=DataBase.connect().prepareStatement(query);			
			ResultSet resultat=req.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(resultat));
			
			
		}catch(Exception ex){
			System.out.println("erreur requète");
		}
		
	}
	public static void ajouterEmployer(String nom,String prenom,String email,String poste,int salaire,String date,String login,String password){
		try{
		Statement state=DataBase.connect().createStatement();
		Statement state2=DataBase.connect().createStatement();
		String sql="INSERT INTO employer(nom,prenom,email,poste,salaire,date_embauche) values('"+nom+"','"+prenom+"','"+email+"','"+poste+"',"+salaire+",'"+date+"');";
		state.executeUpdate(sql);
		String passe="INSERT INTO connecter(login,password) values('"+login+"','"+password+"');";
		state2.executeUpdate(passe);
		}catch(Exception ex){
			System.out.println("erreur");
			
		}
	}
	public static Boolean exist(String login){
		try{
			
			String sql="select * from connecter where login='"+login+"' ;";
		Statement state=DataBase.connect().prepareStatement(sql);
		ResultSet resultat=state.executeQuery(sql);
		
		if(resultat==null){
			return true;
		}else{
			return false;
		}
		}catch(Exception ex){
		System.out.println("erreur de verification");
		}
		return null;
		
	}
	public static void supprimer(int id){
		try{
			Statement state=DataBase.connect().createStatement();
			String sql="DELETE FROM employer WHERE id="+id+" ;";
			Statement state2=DataBase.connect().createStatement();
			state.executeUpdate(sql);
			String sql2="DELETE FROM connecter WHERE id_employer="+id+" ;";
			state2.executeUpdate(sql2);}catch(Exception ex){
				System.out.println("erreur");
				
			}
		
	}
	public static int rechercher(String nom,JTable table){
		int id=-1;
	
	try{
		Statement state=DataBase.connect().createStatement();
		String sql="SELECT id FROM employer WHERE nom='"+nom+"' ;";
		ResultSet resultat=state.executeQuery(sql);
		resultat.next();
	
		if(resultat!=null){
		id=Integer.parseInt(resultat.getString("id"));
		int i;
		for(i=0;i<table.getRowCount();i++){
			if(table.getValueAt(i, 0).equals(id)){
				return i;
			}
		}
		}
		}catch(Exception ex){
			System.out.println("erreur sur la fonction rechercher");
	}
	return id;

}
	public static void modifier(int id,String nom,String prenom,String email,String poste,int salaire){
		try{
			Statement state=DataBase.connect().createStatement();
			String sql="UPDATE employer SET nom='"+nom+"' , prenom='"+prenom+"' , email='"+email+"' , poste='"+poste+"' , salaire="+salaire+" WHERE id="+id+" ;";
			state.executeUpdate(sql);}catch(Exception ex){
				System.out.println("modification non enregistrer");
				
			}
		
	}
	

}
