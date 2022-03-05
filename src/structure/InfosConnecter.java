package structure;

import java.sql.ResultSet;
import java.sql.Statement;

import DAO.DataBase;

public class InfosConnecter {

	public static boolean connecte(String login,String password){
		String sql="select * from connecter where login='"+login+"' and password='"+password+"'";
		try{Statement state=DataBase.connect().prepareStatement(sql);
		ResultSet resultat=state.executeQuery(sql);
		resultat.next();
		String noms=String.valueOf(resultat.getString("login"));
		String pass=String.valueOf(resultat.getString("password"));
		System.out.println(login+" "+password);
		if(noms.equals(login) && pass.equals(password)){
			return true;
		}
			return false;
		
	
		}catch(Exception ex){
			System.out.println("erreur au niveau de la requete conne");
		}
		return false;
	}
	public static String motsDePasseoublier(String login){
		String sql="select password from connecter where login='"+login+"' ;";
		try{Statement state=DataBase.connect().prepareStatement(sql);
		ResultSet resultat=state.executeQuery(sql);
		boolean test=resultat.next();
		
		
	
		if(test==true){
			String pass=String.valueOf(resultat.getString("password"));
			return pass;
		}
			
		return "";
	
		}catch(Exception ex){
			System.out.println("erreur au niveau de la requete connecte");
		}
		return "";
	}
}
