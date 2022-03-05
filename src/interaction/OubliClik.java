package interaction;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import application.FenetreOublier;
import application.MailClass;
import application.Seconnecter;
import structure.InfosConnecter;

public class OubliClik implements MouseListener {
	Seconnecter sc;
	FenetreOublier fo;
	public OubliClik(FenetreOublier fo){
		this.fo=fo;
	}
	public OubliClik(Seconnecter sc){
		this.sc=sc;
	}
	

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(sc!=null){
		if(arg0.getSource().equals(sc.getPasseoublier()))
		{	FenetreOublier foc=new FenetreOublier();
		foc.setVisible(true);
	}
		}if(fo!=null){
			if(arg0.getSource().equals(fo.getEnvoyer())){
				String login=fo.getLogin().getText();
				String password=InfosConnecter.motsDePasseoublier(login);
				String mail=fo.getAdresse().getText();
				MailClass mc=new MailClass();
			
				mc.EnvoyerEmail(mail,password);
			fo.dispose();
			
				
			}else{
				fo.dispose();
				Seconnecter sc=new Seconnecter();
				sc.setVisible(true);
			}
		}
		}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
