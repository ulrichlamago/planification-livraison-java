package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import interaction.Menu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class Fenetreprincipale extends JFrame {

	private JPanel contentPane;
    private JPanel menu;
    private JButton Accueil;
   private  JButton client;
   private JButton colis;
   private JButton tourner;
   private JButton employer;
   private JLabel lblNewLabel_1;
   private JPanel paneaccueil;
   private PaneColis paneColis;
   private Tourner panetourner;
   private PaneClient paneClient;
   private PaneEmployer paneEmployer;
   private JMenuItem mntmQuitter;
private JMenu mnPropos;
private JLabel labelcolis;
private JLabel labelclient;
private JLabel labelemployer;
private JLabel labelplanifier;



	public JMenuItem getMntmQuitter() {
	return mntmQuitter;
}

public void setMntmQuitter(JMenuItem mntmQuitter) {
	this.mntmQuitter = mntmQuitter;
}

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Fenetreprincipale() {
		paneColis=new PaneColis();
		paneClient=new PaneClient();
		panetourner=new Tourner();	
		paneEmployer=new PaneEmployer();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		paneColis.setVisible(false);
		paneClient.setVisible(false);
		panetourner.setVisible(false);
		paneEmployer.setVisible(false);
		Menu me=new Menu(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("fichier");
		menuBar.add(mnFichier);
		
		mntmQuitter = new JMenuItem("quitter");
		mntmQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reponse=JOptionPane.showConfirmDialog(null,"ètes vous sur de vouloir quitter?","vous partez?", JOptionPane.YES_NO_CANCEL_OPTION);
				if(reponse==JOptionPane.YES_OPTION){
				System.exit(0);}
			}
		});
		
		mnFichier.add(mntmQuitter);
		
		mnPropos = new JMenu("\u00E0 propos");
		mnPropos.addMouseListener(me);
	
		menuBar.add(mnPropos);
		contentPane = new JPanel();
		contentPane.add(paneClient);
		contentPane.add(paneColis);
		contentPane.add(panetourner);
		contentPane.add(paneEmployer);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		menu = new JPanel();
		menu.setBackground(new Color(0, 128, 0));
		menu.setBounds(0, 0, 115, 540);
		contentPane.add(menu);
		menu.setLayout(null);
		
		Accueil = new JButton("accueil");
		Accueil.addMouseListener(me);
		Accueil.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Accueil.setForeground(new Color(0, 128, 0));
		Accueil.setBackground(new Color(255, 255, 255));
		Accueil.setBounds(0, 28, 114, 42);
		menu.add(Accueil);
		
		client = new JButton("client");
		client.setFont(new Font("Tahoma", Font.PLAIN, 13));
		client.setForeground(new Color(0, 128, 0));
		client.setBackground(new Color(255, 255, 255));
		client.setBounds(0, 163, 114, 42);
		client.addMouseListener(me);
		menu.add(client);
		
		colis = new JButton("colis");
		colis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		colis.setForeground(new Color(0, 128, 0));
		colis.setBackground(new Color(255, 255, 255));
		colis.setBounds(0, 94, 114, 42);
		colis.addMouseListener(me);
		menu.add(colis);
		
		tourner = new JButton("tourner");
		tourner.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tourner.setForeground(new Color(0, 128, 0));
		tourner.setBackground(new Color(255, 255, 255));
		tourner.setBounds(0, 233, 114, 42);		
		tourner.addMouseListener(me);
		menu.add(tourner);
		
		employer = new JButton("employer");
		employer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		employer.setForeground(new Color(0, 128, 0));
		employer.setBackground(new Color(255, 255, 255));
		employer.setBounds(0, 304, 114, 42);
		employer.addMouseListener(me);
		menu.add(employer);
		
		paneaccueil = new JPanelBack("src/application/accueil.jpg");
		paneaccueil.setBounds(115, 0, 669, 540);
		contentPane.add(paneaccueil);
		paneaccueil.setLayout(null);
		
		lblNewLabel_1 = new JLabel("bienvenue");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(213, 42, 200, 47);
		paneaccueil.add(lblNewLabel_1);
		
		labelcolis = new JLabel("consulter colis");
		labelcolis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labelcolis.setForeground(Color.WHITE);
		labelcolis.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelcolis.setBounds(175, 279, 118, 36);
		labelcolis.addMouseListener(me);
		paneaccueil.add(labelcolis);
		
		labelclient = new JLabel("consulter un client");
		labelclient.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labelclient.setForeground(Color.WHITE);
		labelclient.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelclient.setBounds(175, 328, 150, 24);
		labelclient.addMouseListener(me);
		paneaccueil.add(labelclient);
		
		JLabel lblNewLabel = new JLabel("liste des t\u00E0ches:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(200, 133, 200, 31);
		paneaccueil.add(lblNewLabel);
		
		labelemployer = new JLabel("consulter employer");
		labelemployer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labelemployer.setForeground(new Color(255, 255, 255));
		labelemployer.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelemployer.setBounds(175, 182, 175, 14);
	labelemployer.addMouseListener(me);
		paneaccueil.add(labelemployer);
		
		labelplanifier = new JLabel("planifier tourner");
		labelplanifier.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		labelplanifier.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelplanifier.setForeground(new Color(255, 255, 255));
		labelplanifier.setBounds(175, 230, 175, 24);
		labelplanifier.addMouseListener(me);
		paneaccueil.add(labelplanifier);
		
		
		
		
	}

	public JLabel getLabelcolis() {
		return labelcolis;
	}

	public JLabel getLabelclient() {
		return labelclient;
	}

	public JLabel getLabelemployer() {
		return labelemployer;
	}

	public JLabel getLabelplanifier() {
		return labelplanifier;
	}

	public PaneEmployer getPaneEmployer() {
		return paneEmployer;
	}

	public void setPaneEmployer(PaneEmployer paneEmployer) {
		this.paneEmployer = paneEmployer;
	}

	public JPanel getMenu() {
		return menu;
	}

	public void setMenu(JPanel menu) {
		this.menu = menu;
	}

	public JButton getAccueil() {
		return Accueil;
	}

	public void setAccueil(JButton accueil) {
		Accueil = accueil;
	}

	public JButton getClient() {
		return client;
	}

	public void setClient(JButton client) {
		this.client = client;
	}

	public JButton getColis() {
		return colis;
	}

	public void setColis(JButton colis) {
		this.colis = colis;
	}

	public JButton getTourner() {
		return tourner;
	}

	public void setTourner(JButton tourner) {
		this.tourner = tourner;
	}

	public JButton getEmployer() {
		return employer;
	}

	public void setEmployer(JButton employer) {
		this.employer = employer;
	}

	public JPanel getPaneaccueil() {
		return paneaccueil;
	}

	public void setPaneaccueil(JPanel paneaccueil) {
		this.paneaccueil = paneaccueil;
	}

	public PaneColis getPaneColis() {
		return paneColis;
	}

	public void setPaneColis(PaneColis paneColis) {
		this.paneColis = paneColis;
	}

	public Tourner getPanetourner() {
		return panetourner;
	}

	public void setPanetourner(Tourner panetourner) {
		this.panetourner = panetourner;
	}

	public PaneClient getPaneClient() {
		return paneClient;
	}

	public void setPaneClient(PaneClient paneClient) {
		this.paneClient = paneClient;
	}
}
