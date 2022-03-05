package application;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;

import interaction.ActionClient;
import interaction.ActionPanelClient;
import net.proteanit.sql.DbUtils;
import structure.InfosClient;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaneClient extends JPanel {
	private JTable table;
	private JTextField textrechercher;
	private JButton rechercher;
	private JButton Ajouter;
	private JButton Supprimer;
	private JButton appliquer;

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getTextrechercher() {
		return textrechercher;
	}

	public void setTextrechercher(JTextField textrechercher) {
		this.textrechercher = textrechercher;
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

	public JButton getSupprimer() {
		return Supprimer;
	}

	public void setSupprimer(JButton supprimer) {
		Supprimer = supprimer;
	}

	public JButton getAppliquer() {
		return appliquer;
	}

	public void setAppliquer(JButton appliquer) {
		this.appliquer = appliquer;
	}

	/**
	 * Create the panel.
	 */
	public PaneClient() {
		this.setBounds(115, 0, 669, 540);
		setLayout(null);
		ActionPanelClient ac=new ActionPanelClient(this);
		
		JPanel panel = new JPanelBack("src/application/client.jpg");
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(0, 0, 669, 540);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblConsultezLtatDe = new JLabel("consultez l'\u00E9tat de vos client");
		lblConsultezLtatDe.setForeground(new Color(255, 255, 255));
		lblConsultezLtatDe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConsultezLtatDe.setBounds(111, 36, 300, 59);
		panel.add(lblConsultezLtatDe);
		
		Ajouter = new JButton("ajouter");
		Ajouter.setBackground(new Color(0, 128, 0));
		Ajouter.setForeground(new Color(255, 255, 255));
		Ajouter.setBounds(539, 196, 89, 23);
		Ajouter.addActionListener(ac);
		panel.add(Ajouter);
		
		appliquer = new JButton("appliquer");
		appliquer.setEnabled(false);
		appliquer.setBackground(new Color(0, 128, 0));
		appliquer.setForeground(new Color(255, 255, 255));
		appliquer.setBounds(539, 248, 89, 23);
		appliquer.addActionListener(ac);
		panel.add(appliquer);
		
		
		Supprimer = new JButton("supprimer");
		Supprimer.setEnabled(false);
		Supprimer.setBackground(new Color(0, 128, 0));
		Supprimer.setForeground(new Color(255, 255, 255));
		Supprimer.setBounds(539, 308, 89, 23);
		Supprimer.addActionListener(ac);
		panel.add(Supprimer);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(111, 200, 404, 246);
		panel.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(table.getSelectedRow()!=-1){
					Supprimer.setEnabled(true);
					
					appliquer.setEnabled(true);
				}
			}
		});
		scrollPane.setViewportView(table);
		InfosClient.remplir(table);
		
		rechercher = new JButton("rechercher");
		rechercher.setBounds(424, 130, 89, 23);
		rechercher.addActionListener(ac);
		panel.add(rechercher);
		
		textrechercher = new JTextField();
		textrechercher.setBounds(295, 131, 116, 20);
		panel.add(textrechercher);
		textrechercher.setColumns(10);
		
		JButton Actualiser = new JButton("actualiser");
		Actualiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InfosClient.remplir(table);
			}
		});
		Actualiser.setBounds(539, 367, 89, 23);
		panel.add(Actualiser);

	}
}
