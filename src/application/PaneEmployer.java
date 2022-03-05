package application;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import interaction.ActionPaneEmployer;
import structure.InfosEmployer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PaneEmployer extends JPanel {
	private JTextField textRechercher;
	private JTable table;
	private JButton rechercher;
	private JButton Ajouter;
	private JButton appliquer;
	private JButton supprimer ;
	private JButton Actualiser;
	

	/**
	 * Create the panel.
	 */
	public PaneEmployer() {
		this.setBounds(115, 0, 669, 540);
		setLayout(null);
		ActionPaneEmployer ape=new ActionPaneEmployer(this);
		
		JPanel panel = new JPanelBack("src/application/employer.jpg");
		panel.setBackground(new Color(255, 228, 181));
		panel.setBounds(0, 0, 669, 551);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblConsulterLetatDes = new JLabel("consulter l'etat des employer ");
		lblConsulterLetatDes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConsulterLetatDes.setForeground(new Color(0, 128, 0));
		lblConsulterLetatDes.setBounds(203, 34, 264, 37);
		panel.add(lblConsulterLetatDes);
		
		Ajouter = new JButton("ajouter");
		Ajouter.setBounds(554, 246, 89, 23);
	    Ajouter.addActionListener(ape);
		panel.add(Ajouter);
		
		appliquer = new JButton("appliquer");
		appliquer.setEnabled(false);
		appliquer.setBounds(554, 307, 89, 23);
		appliquer.addActionListener(ape);
		panel.add(appliquer);
		
		supprimer = new JButton("supprimer");
		supprimer.setEnabled(false);
		supprimer.setBounds(554, 366, 89, 23);
		supprimer.addActionListener(ape);
		panel.add(supprimer);
		
		rechercher = new JButton("rechercher");
		rechercher.setBounds(441, 127, 89, 23);
		rechercher.addActionListener(ape);
		panel.add(rechercher);
		
		textRechercher = new JTextField();
		textRechercher.setBounds(312, 128, 119, 20);
		panel.add(textRechercher);
		textRechercher.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(64, 219, 466, 283);
		panel.add(scrollPane);
		
		table = new JTable();
		InfosEmployer.remplir(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(table.getSelectedRow()!=-1){
					getAppliquer().setEnabled(true);
					getSupprimer().setEnabled(true);
				}
			}
		}
		);
		scrollPane.setViewportView(table);
		InfosEmployer.remplir(table);
		
		Actualiser = new JButton("actualiser");
		Actualiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfosEmployer.remplir(table);
			}
		});
		Actualiser.setBounds(554, 428, 89, 23);
		panel.add(Actualiser);
		

	}

	public JTextField getTextRechercher() {
		return textRechercher;
	}

	public void setTextField(JTextField textField) {
		this.textRechercher = textField;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getRechercher() {
		return rechercher;
	}

	public void setRechercher(JButton rechercher) {
		this.rechercher = rechercher;
	}

	public JButton getAjouter() {
		return Ajouter;
	}

	public void setAjouter(JButton ajouter) {
		Ajouter = ajouter;
	}

	public JButton getAppliquer() {
		return appliquer;
	}

	public void setAppliquer(JButton appliquer) {
		this.appliquer = appliquer;
	}

	public JButton getSupprimer() {
		return supprimer;
	}

	public void setSupprimer(JButton supprimer) {
		this.supprimer = supprimer;
	}
	
	
}
