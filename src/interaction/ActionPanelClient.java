package interaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import application.Client;
import application.PaneClient;
import structure.InfosClient;

public class ActionPanelClient implements ActionListener {
	PaneClient pc;
	public ActionPanelClient(PaneClient pc){
		this.pc=pc;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(pc.getAjouter())){
			Client cl=new Client(pc);
			cl.setVisible(true);
		}else if(arg0.getSource().equals(pc.getRechercher())){
			int id=InfosClient.rechercher(pc.getTextrechercher().getText(),pc.getTable());
			if(id==-1){
				JOptionPane.showMessageDialog(null, "le client rechercher est inexistant");
			}else{
			pc.getTable().setRowSelectionInterval(id, id);}
			
			}else if(arg0.getSource().equals(pc.getAppliquer())){
			int numligne=pc.getTable().getSelectedRow();
			int id=Integer.parseInt((String.valueOf(pc.getTable().getValueAt(numligne, 0))));
			
			String nom=String.valueOf(pc.getTable().getValueAt(numligne, 1));
			String prenom=String.valueOf(pc.getTable().getValueAt(numligne, 2));
			
			InfosClient.modifier(id, nom , prenom, (String)pc.getTable().getValueAt(numligne, 3), (String)pc.getTable().getValueAt(numligne, 4),(String)pc.getTable().getValueAt(numligne, 5));
			InfosClient.remplir(pc.getTable());
			pc.getAppliquer().setEnabled(false);
			pc.getSupprimer().setEnabled(false);
			JOptionPane.showMessageDialog(null, "modification effectuer avec succès");
			}else{
				int reponse=JOptionPane.showConfirmDialog(null, "etes vous sur de vouloir le supprimer?", "avertissement", JOptionPane.YES_NO_OPTION);
				if(reponse==JOptionPane.YES_OPTION){
				int numligne=pc.getTable().getSelectedRow();
				int id=Integer.parseInt((String.valueOf(pc.getTable().getValueAt(numligne, 0))));
				InfosClient.supprimer(id);
				pc.getAppliquer().setEnabled(false);
				pc.getSupprimer().setEnabled(false);
				InfosClient.remplir(pc.getTable());
				JOptionPane.showMessageDialog(null, "suppression effectuer avec succès");}
				
			}
			
		
		}
		// TODO Auto-generated method stub

	}


