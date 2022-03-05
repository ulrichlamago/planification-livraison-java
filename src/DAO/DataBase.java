package DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {



	
	public static Connection connexion;
	private DataBase(){
		try{Class.forName("com.mysql.jdbc.Driver");
		connexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/agence", "root", "");
		}catch(Exception e){
			System.out.println("erreur de connexion à la base de donnee");
		}
	}
	public static Connection connect(){
		if(connexion==null){
			new DataBase();
		}
		return connexion;
	} 

	}


