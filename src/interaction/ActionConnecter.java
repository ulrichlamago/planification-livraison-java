package interaction;

import java.awt.Color;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import  structure.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import application.FenetreOublier;
import application.Fenetreprincipale;
import application.Seconnecter;
import structure.InfosConnecter;

public class ActionConnecter implements ActionListener,MouseListener {
Seconnecter sc;
public ActionConnecter(Seconnecter sc){
	this.sc=sc;
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
if(arg0.getSource().equals(sc.getConnexion())){	
String motspasse="";
int i=0;
for(i=0;i<sc.getPassword().getPassword().length;i++){
	motspasse=motspasse+ (sc.getPassword().getPassword())[i];
}
if(InfosConnecter.connecte(sc.getLogin().getText(), motspasse)){
	if(sc.getLogin().getText().equals("ulrich")==false){
	Fenetreprincipale fp=new Fenetreprincipale();
	fp.setVisible(true);
	fp.getEmployer().setVisible(false);
	fp.setResizable(false);
	sc.dispose();}else{
		Fenetreprincipale fp=new Fenetreprincipale();
		fp.setVisible(true);
		fp.setResizable(false);
		sc.dispose();
	}
}else{
	JOptionPane.showMessageDialog(null, "login ou mots de passe incorrecte", "erreur", JOptionPane.ERROR_MESSAGE);
	
}}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource().equals(sc.getFermer())){
			sc.dispose();
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
		
		// TODO Auto-generated method stub
		
	}

}
