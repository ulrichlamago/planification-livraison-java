package application;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import interaction.ActionColis;
import interaction.ActionPaneColis;
import structure.InfosColis;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaneColis extends JPanel {
 private JPanel panel;
 private JTable table;
 private JButton Ajouter;
 private JTextField textRechercher;
 private JButton appliquer;
 private 	JButton Supprimer;
 private JButton rechercher;
 private JScrollPane scrollPane;
	public JPanel getPanel() {
	return panel;
}
public void setPanel(JPanel panel) {
	this.panel = panel;
}
	/**
	 * Create the panel.
	 */
	public PaneColis() {
		setLayout(null);
		this.setBounds(115, 0, 669, 540);
		ActionPaneColis apc=new ActionPaneColis(this);
		
		panel = new JPanelBack("src/application/fondpanecolis.jpg");
		panel.setLayout(null);
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 669, 540);
		add(panel);
		
		JLabel lblConsulterLtatDes = new JLabel("consulter l'\u00E9tat des colis");
		lblConsulterLtatDes.setForeground(new Color(0, 128, 0));
		lblConsulterLtatDes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConsulterLtatDes.setBounds(100, 11, 298, 95);
		panel.add(lblConsulterLtatDes);
		
		Ajouter = new JButton("ajouter");
		Ajouter.setBounds(557, 210, 89, 23);
		Ajouter.addActionListener(apc);
		panel.add(Ajouter);
		
		appliquer = new JButton("appliquer");
		appliquer.setEnabled(false);
		appliquer.setBounds(557, 270, 89, 23);
		appliquer.addActionListener(apc);
		panel.add(appliquer);
		
		Supprimer = new JButton("supprimer");
		Supprimer.setEnabled(false);
		Supprimer.setBounds(557, 331, 89, 23);
		Supprimer.addActionListener(apc);
		panel.add(Supprimer);
		
		scrollPane = new JScrollPane();
		
		scrollPane.setBounds(47, 212, 500, 317);
		panel.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(table.getSelectedRow()!=-1){
					appliquer.setEnabled(true);
					Supprimer.setEnabled(true);
				}
				
			}
		});
	
		scrollPane.setViewportView(table);
		InfosColis.remplir(table);
		
		
		
		rechercher = new JButton("rechercher");
		rechercher.setBounds(557, 133, 89, 23);
		rechercher.addActionListener(apc);
		panel.add(rechercher);
		
		
		textRechercher = new JTextField();
		textRechercher.setBounds(417, 134, 130, 20);
		panel.add(textRechercher);
		textRechercher.setColumns(10);
		
		JButton Actualiser = new JButton("actualiser");
		Actualiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfosColis.remplir(table);
			}
		});
		Actualiser.setBounds(557, 395, 89, 23);
		panel.add(Actualiser);

	}
	public JTable getTable() {
		return table;
	}
	public void setTable(JTable table) {
		this.table = table;
	}
	public JButton getAjouter() {
		return Ajouter;
	}
	public void setAjouter(JButton ajouter) {
		Ajouter = ajouter;
	}
	public JTextField getTextRechercher() {
		return textRechercher;
	}
	public void setTextRechercher(JTextField textField) {
		this.textRechercher = textField;
	}
	public JButton getAppliquer() {
		return appliquer;
	}
	public void setAppliquer(JButton modifier) {
		appliquer = modifier;
	}
	public JButton getSupprimer() {
		return Supprimer;
	}
	public void setSupprimer(JButton supprimer) {
		Supprimer = supprimer;
	}
	public JButton getRechercher() {
		return rechercher;
	}
	public void setRechercher(JButton rechercher) {
		this.rechercher = rechercher;
	}
}
