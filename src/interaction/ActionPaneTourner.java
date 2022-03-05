package interaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import application.Tourner;
import structure.InfosTourner;

public class ActionPaneTourner implements ActionListener {
Tourner tou;
public ActionPaneTourner(Tourner tou){
	this.tou=tou;
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String ville=String.valueOf(tou.getVille().getSelectedItem());
		String chauffeur=String.valueOf(tou.getChauffeur().getSelectedItem());
		if(arg0.getSource().equals(tou.getValider())){
			
			InfosTourner.organiseztourner(ville, tou.getTable());
			tou.getTable().setEnabled(false);;
		}else if(arg0.getSource().equals(tou.getEnregistrer())){
			String format = "dd/MM/yy";

			java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format );
			java.util.Date date = new java.util.Date();
	        String textdate=formater.format( date );
			InfosTourner.enregistertourner(chauffeur, ville, textdate);
			InfosTourner.statutcolis(ville);
			JOptionPane.showMessageDialog(null, "enregistrement effectuer avec succès", "opération effectuer", JOptionPane.INFORMATION_MESSAGE);
			InfosTourner.remplir(tou.getTable());
			tou.getTable().setEnabled(true);
		}else{
			InfosTourner.remplir(tou.getTable());
		tou.getTable().setEnabled(false);
			
		}
		// TODO Auto-generated method stub

	}

}
