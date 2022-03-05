package interaction;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import application.Client;
import application.Fenetreprincipale;
import application.Tourner;

public class Menu implements MouseListener {
	Fenetreprincipale fp;
	

	public Menu(Fenetreprincipale fp) {
		super();
		this.fp = fp;
	
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		if(arg0.getSource().equals(fp.getAccueil())){
			fp.getPaneaccueil().setVisible(true);
			fp.getPaneColis().setVisible(false);
			fp.getPaneClient().setVisible(false);
			fp.getPanetourner().setVisible(false);
			fp.getPaneEmployer().setVisible(false);}
		
	else if(arg0.getSource().equals(fp.getTourner()) || arg0.getSource().equals(fp.getLabelplanifier())){
			fp.getPanetourner().setVisible(true);
			fp.getPaneaccueil().setVisible(false);
			fp.getPaneColis().setVisible(false);
			fp.getPaneClient().setVisible(false);
			fp.getPaneEmployer().setVisible(false);
			
           
		
			
				
			}else if(arg0.getSource().equals(fp.getClient()) || arg0.getSource().equals(fp.getLabelclient())){
				fp.getPaneaccueil().setVisible(false);
				fp.getPaneColis().setVisible(false);
				fp.getPaneClient().setVisible(true);
				fp.getPanetourner().setVisible(false);
				fp.getPaneEmployer().setVisible(false);
				
			}else if(arg0.getSource().equals(fp.getColis()) || arg0.getSource().equals(fp.getLabelcolis())){
				
				fp.getPaneaccueil().setVisible(false);
				fp.getPaneColis().setVisible(true);
				fp.getPaneClient().setVisible(false);
				fp.getPanetourner().setVisible(false);
				fp.getPaneEmployer().setVisible(false);
			}else if(arg0.getSource().equals(fp.getEmployer()) || arg0.getSource().equals(fp.getLabelemployer())){
				
				fp.getPaneaccueil().setVisible(false);
				fp.getPaneColis().setVisible(false);
				fp.getPaneClient().setVisible(false);
				fp.getPanetourner().setVisible(false);
				fp.getPaneEmployer().setVisible(true);
			}else if(arg0.getSource().equals(fp.getMntmQuitter())){
				int reponse=JOptionPane.showConfirmDialog(null, "etes vous sur de vouloir de quitter?", "depart", JOptionPane.YES_NO_OPTION);
				if(reponse==JOptionPane.YES_OPTION){
				fp.dispose();
				}
				fp.dispose();
				
			}else{
				JOptionPane.showMessageDialog(null, "ils s'agit d'un devoir de java \n system de livraison d'une agence de livraison");
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
