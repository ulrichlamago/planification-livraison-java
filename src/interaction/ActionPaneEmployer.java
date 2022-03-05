package interaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import application.InscriptionEmployer;
import application.PaneEmployer;
import structure.InfosClient;
import structure.InfosEmployer;

public class ActionPaneEmployer implements ActionListener {
	PaneEmployer pe;
	public ActionPaneEmployer(PaneEmployer pe){
		this.pe=pe;
	}
		

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
	if(arg0.getSource().equals(pe.getAjouter())){
		InscriptionEmployer emplois=new InscriptionEmployer(pe);
	
		emplois.setVisible(true);
	}else if(arg0.getSource().equals(pe.getAppliquer())){
		int numligne=pe.getTable().getSelectedRow();
		int id=Integer.parseInt((String.valueOf(pe.getTable().getValueAt(numligne, 0))));
		
		String nom=String.valueOf(pe.getTable().getValueAt(numligne, 1));
		String prenom=String.valueOf(pe.getTable().getValueAt(numligne, 2));
		String email=String.valueOf(pe.getTable().getValueAt(numligne, 3));
		String poste=String.valueOf(pe.getTable().getValueAt(numligne, 4));
		
		
		int salaire=Integer.parseInt((String.valueOf(pe.getTable().getValueAt(numligne, 5))));
		InfosEmployer.modifier(id, nom , prenom, email, poste,salaire);
		InfosEmployer.remplir(pe.getTable());
		pe.getAppliquer().setEnabled(false);
		pe.getSupprimer().setEnabled(false);
		JOptionPane.showMessageDialog(null, "modification effectuer avec succès");}
	else if(arg0.getSource().equals(pe.getRechercher())){
	
			int id=InfosEmployer.rechercher(pe.getTextRechercher().getText(),pe.getTable());
			if(id==-1){
				JOptionPane.showMessageDialog(null, "le client rechercher est inexistant");
			}else{
			pe.getTable().setRowSelectionInterval(id, id);
			pe.getAppliquer().setEnabled(false);
			pe.getSupprimer().setEnabled(true);}
			
			
	}else {
		int reponse=JOptionPane.showConfirmDialog(null, "etes vous sur de vouloir le supprimer?", "avertissement", JOptionPane.YES_NO_OPTION);
	if(reponse==JOptionPane.YES_OPTION){
	int numligne=pe.getTable().getSelectedRow();
	int id=Integer.parseInt((String.valueOf(pe.getTable().getValueAt(numligne, 0))));
	InfosEmployer.supprimer(id);
	pe.getAppliquer().setEnabled(false);
	pe.getSupprimer().setEnabled(false);
	InfosEmployer.remplir(pe.getTable());
	JOptionPane.showMessageDialog(null, "suppression effectuer avec succès");}
		
	}
		// TODO Auto-generated method stub

	}

}
