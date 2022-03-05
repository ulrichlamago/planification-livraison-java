package application;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import interaction.ActionPaneTourner;
import structure.InfosTourner;

import javax.swing.JComboBox;

public class Tourner extends JPanel {
	private JTable table;
	private JComboBox ville;
	private JButton valider;
	private JComboBox chauffeur;
	private JButton Enregistrer;
	private JButton listertourner;

	public JButton getEnregistrer() {
		return Enregistrer;
	}

	public void setEnregistrer(JButton enregistrer) {
		Enregistrer = enregistrer;
	}

	public JComboBox getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(JComboBox chauffeur) {
		this.chauffeur = chauffeur;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}


	public JComboBox getVille() {
		return ville;
	}

	public void setVille(JComboBox ville) {
		this.ville = ville;
	}

	public JButton getValider() {
		return valider;
	}

	public void setValider(JButton valider) {
		this.valider = valider;
	}

	/**
	 * Create the panel.
	 */
	public Tourner() {
		setBackground(Color.WHITE);
		setLayout(null);
		this.setBounds(115, 0, 669, 540);
		ActionPaneTourner apt=new ActionPaneTourner(this);
		
		JPanel panel = new JPanelBack("src/application/tourner.jpg");
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 669, 540);
		add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("planifier une tourner");
		label.setBounds(227, 52, 173, 23);
		label.setForeground(new Color(0, 128, 0));
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(label);
		
		JLabel label_1 = new JLabel("ville:");
		label_1.setBounds(165, 107, 27, 19);
		label_1.setForeground(new Color(0, 128, 0));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("chauffeur:");
		label_2.setBounds(165, 150, 67, 19);
		label_2.setForeground(new Color(0, 128, 0));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(label_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 242, 567, 245);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		valider = new JButton("valider");
		valider.addActionListener(apt);
		valider.setBounds(289, 200, 89, 23);
		panel.add(valider);
		
		ville = new JComboBox();
		ville.addItem("tunis");
		ville.addItem("nabeul");
		ville.addItem("sousse");
		ville.setBounds(273, 108, 105, 20);
		panel.add(ville);
		
		chauffeur = new JComboBox();
		InfosTourner.chauffeur(chauffeur);
		chauffeur.setBounds(273, 151, 105, 20);
		panel.add(chauffeur);
		
		Enregistrer = new JButton("enregistrer");
		Enregistrer.addActionListener(apt);
		Enregistrer.setBounds(541, 506, 89, 23);
		panel.add(Enregistrer);
		
		listertourner = new JButton("liste des tourner");
		listertourner.addActionListener(apt);
		listertourner.setBounds(63, 506, 129, 23);
		panel.add(listertourner);

	}

	public JButton getListertourner() {
		return listertourner;
	}

	public void setListertourner(JButton listertourner) {
		this.listertourner = listertourner;
	}
}
