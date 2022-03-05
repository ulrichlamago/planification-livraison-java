package interaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import application.Fenetrecolis;
import application.PaneColis;
import structure.InfosColis;

public class ActionColis implements ActionListener {
	Fenetrecolis fc;
	
	public ActionColis(Fenetrecolis fc){
		this.fc=fc;
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if(arg0.getSource().equals(fc.getAjouter())){
			if(fc.getNomDes().getText().equals("") || fc.getNomEx().getText().equals("") || fc.getColis().getText().equals("") || fc.getQuantite().getText().equals("")){
				JOptionPane.showMessageDialog(null,"tous les champs doivent ètre remplie", "erreur", JOptionPane.ERROR_MESSAGE);
			}else{
				try{
					int quantiter=Integer.parseInt(fc.getQuantite().getText());
					String format = "dd/MM/yy";

					java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format );
					java.util.Date date = new java.util.Date();
                    String textdate=formater.format( date );
					System.out.println( formater.format( date ) ); 
					InfosColis.ajouterColis(fc.getColis().getText(), fc.getNomEx().getText(), 2, "tunis", fc.getNomDes().getText(), fc.getVilledes().getText(), fc.getTel().getText(),textdate , quantiter);
					JOptionPane.showMessageDialog(null, "enregistrement effectuer avec succès");
					InfosColis.remplir(fc.getPc().getTable());
					System.out.println("eeeeeee");
					fc.dispose();
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "la quantité  et les frais ne peuvent pas  ètre une chaine de caractète", "erreur de saisie", JOptionPane.ERROR_MESSAGE);
				}
			}
		}else{
			fc.dispose();
		}
	}

}
