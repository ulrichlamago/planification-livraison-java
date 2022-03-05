package interaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import application.Fenetrecolis;
import application.PaneColis;
import structure.InfosColis;
import structure.InfosEmployer;

public class ActionPaneColis implements ActionListener {
	PaneColis pc;
	public ActionPaneColis(PaneColis pc){
		this.pc=pc;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(pc.getAjouter())){
			Fenetrecolis fc=new Fenetrecolis(pc);
			fc.setVisible(true);
		}else if(arg0.getSource().equals(pc.getRechercher())){
			int id=InfosColis.rechercher(pc.getTextRechercher().getText(),pc.getTable());
			if(id==-1){
				JOptionPane.showMessageDialog(null, "le colis rechercher est inexistant");
			}else{
			pc.getTable().setRowSelectionInterval(id, id);
			pc.getSupprimer().setEnabled(true);}
			
		}else if(arg0.getSource().equals(pc.getAppliquer())){
			int numligne=pc.getTable().getSelectedRow();
			int id=Integer.parseInt((String.valueOf(pc.getTable().getValueAt(numligne, 0))));
			
			String nom_colis=String.valueOf(pc.getTable().getValueAt(numligne, 1));
			String nom_expediteur=String.valueOf(pc.getTable().getValueAt(numligne, 2));
			int id_expediteur=Integer.parseInt(String.valueOf(pc.getTable().getValueAt(numligne, 3)));
			String ville_expediteur=String.valueOf(pc.getTable().getValueAt(numligne, 4));
			String nom_destinataire=String.valueOf(pc.getTable().getValueAt(numligne, 5));
			String ville_destinataire=String.valueOf(pc.getTable().getValueAt(numligne, 6));
			String tel=String.valueOf(pc.getTable().getValueAt(numligne, 7));
			String date_envoi=String.valueOf(pc.getTable().getValueAt(numligne, 8));
			String statut=String.valueOf(pc.getTable().getValueAt(numligne, 9));
			int quanti=Integer.parseInt(String.valueOf(pc.getTable().getValueAt(numligne, 10)));
			
			
			
			InfosColis.modifier(id,nom_colis , nom_expediteur, id_expediteur, ville_expediteur,nom_destinataire,ville_destinataire,tel,date_envoi,statut,quanti);
			InfosColis.remplir(pc.getTable());
			pc.getAppliquer().setEnabled(false);
			pc.getSupprimer().setEnabled(false);
			JOptionPane.showMessageDialog(null, "modification effectuer avec succès");
		}else if(arg0.getSource().equals(pc.getSupprimer())){
			int reponse=JOptionPane.showConfirmDialog(null, "etes vous sur de vouloir le supprimer?", "avertissement", JOptionPane.YES_NO_OPTION);
			if(reponse==JOptionPane.YES_OPTION){
			int numligne=pc.getTable().getSelectedRow();
			int id=Integer.parseInt((String.valueOf(pc.getTable().getValueAt(numligne, 0))));
			InfosColis.supprimer(id);
			pc.getAppliquer().setEnabled(false);
			pc.getSupprimer().setEnabled(false);
			InfosColis.remplir(pc.getTable());
			JOptionPane.showMessageDialog(null, "suppression effectuer avec succès");}
			}
		
		// TODO Auto-generated method stub

	}

}
