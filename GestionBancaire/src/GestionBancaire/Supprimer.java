package GestionBancaire;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Label;


public class Supprimer {
	  private JFrame frame;
	  
	  private JTextField Idclient;
	  
	  public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	          public void run() {
	            try {
	            	Supprimer window = new Supprimer();
	              window.frame.setVisible(true);
	            } catch (Exception e) {
	              e.printStackTrace();
	            } 
	          }
	        });
	  }
	  
	  public Supprimer() {
	    initialize();
	  }
	  
	  private void initialize() {
	    this.frame = new JFrame();
	    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
	    this.frame.setBounds(100, 100, 380, 312);
	    this.frame.setDefaultCloseOperation(2);
	    JMenuBar menuBar = new JMenuBar();
	    menuBar.setFont(new Font("Segoe UI", 0, 15));
	    menuBar.setBackground(SystemColor.inactiveCaptionBorder);
	    this.frame.setJMenuBar(menuBar);
	    JMenu mnNewMenu_1 = new JMenu("Menu");
	    mnNewMenu_1.setFont(new Font("Segoe UI", 0, 15));
	    mnNewMenu_1.setBackground(SystemColor.inactiveCaptionBorder);
	    menuBar.add(mnNewMenu_1);
	    JMenuItem Accueil = new JMenuItem("Retour a l'accueil");
	    Accueil.setFont(new Font("Segoe UI", 0, 15));
	    Accueil.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	        	  Supprimer.this.frame.setVisible(false);
	            GestionBancaire.main(null);
	          }
	        });
	    mnNewMenu_1.add(Accueil);
	    JSeparator separator = new JSeparator();
	    mnNewMenu_1.add(separator);
	    JMenuItem Quitter = new JMenuItem("Quitter");
	    Quitter.setFont(new Font("Segoe UI", 0, 15));
	    Quitter.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	        	  Supprimer.this.frame = new JFrame("quitter");
	            if (JOptionPane.showConfirmDialog(Supprimer.this.frame, "Voulez-vous rquitter l'appli Banque?", "IE Bank", 
	                0) == 0)
	              System.exit(1); 
	          }
	        });
	    mnNewMenu_1.add(Quitter);
	    JMenu mnNewMenu_2 = new JMenu("Afficher");
	    mnNewMenu_2.setFont(new Font("Segoe UI", 0, 15));
	    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
	    menuBar.add(mnNewMenu_2);
	    JMenuItem AfficherUnCompte = new JMenuItem("Un type de compte / un compte specifique");
	    AfficherUnCompte.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	        	  Supprimer.this.frame.setVisible(false);
	            TypeDeCompte.main(null);
	          }
	        });
	    AfficherUnCompte.setFont(new Font("Segoe UI", 0, 15));
	    mnNewMenu_2.add(AfficherUnCompte);
	    JSeparator separator_2 = new JSeparator();
	    mnNewMenu_2.add(separator_2);
	    JMenuItem AfficherTypeCompte = new JMenuItem("Tout les comptes");
	    AfficherTypeCompte.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	        	  Supprimer.this.frame.setVisible(false);
	        	  Affichage.main(null);
	          }
	        });
	    AfficherTypeCompte.setFont(new Font("Segoe UI", 0, 15));
	    mnNewMenu_2.add(AfficherTypeCompte);
	    this.frame.getContentPane().setLayout((LayoutManager)null);
	    frame.getContentPane().setLayout(null);
	    frame.getContentPane().setLayout(null);
	    JLabel lblNewLabel = new JLabel("Supprimer");
	    lblNewLabel.setForeground(Color.RED);
	    lblNewLabel.setHorizontalAlignment(0);
	    lblNewLabel.setFont(new Font("DialogInput", Font.BOLD, 24));
	    lblNewLabel.setBounds(12, 13, 338, 59);
	    this.frame.getContentPane().add(lblNewLabel);
	    this.Idclient = new JTextField();
	    Idclient.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    this.Idclient.setBounds(39, 161, 285, 34);
	    this.frame.getContentPane().add(this.Idclient);
	    this.Idclient.setColumns(10);
	    JButton delete = new JButton("Supprimer");
	    delete.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    delete.setSize(new Dimension(100, 21));
	    delete.setPreferredSize(new Dimension(100, 21));
	    delete.setMargin(new Insets(2, 5, 2, 5));
	    delete.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    delete.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    delete.addActionListener(new ActionListener() {
	          @SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) {
	        	  Supprimer.this.frame = new JFrame("Supprimer");
	            File writter = new File("temp.dat");
	            try {
	              if (writter.exists()) {
	                writter.delete();
	                writter.createNewFile();
	              } 
	              if (!writter.exists())
	                writter.createNewFile(); 
	              FileWriter fileWritter = new FileWriter(writter.getName(), false);
	              @SuppressWarnings("unused")
				BufferedWriter bw = new BufferedWriter(fileWritter);
	              File verificator = new File("banque.dat");
	              Scanner in = null;
	              in = new Scanner(verificator);
	              while (in.hasNext()) {
	                String line = in.nextLine();
	                if (!line.contains(Supprimer.this.Idclient.getText().toUpperCase())) {
	                  fileWritter.write(line);
	                  fileWritter.write("\n");
	                } 
	              } 
	              fileWritter.close();
	            } catch (Exception f) {
	              f.printStackTrace();
	            } 
	            JOptionPane.showMessageDialog(Supprimer.this.frame, "Suppression termin");
	            Supprimer.this.frame.setVisible(false);
	            GestionBancaire.main(null);
	          }
	        });
	    delete.setBounds(81, 205, 201, 34);
	    this.frame.getContentPane().add(delete);
	    JLabel lblNewLabel_1 = new JLabel("Inserez le numero du client");
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblNewLabel_1.setHorizontalAlignment(0);
	    lblNewLabel_1.setBounds(12, 123, 338, 16);
	    this.frame.getContentPane().add(lblNewLabel_1);
	    
	    Label label = new Label("New label");
	    label.setBounds(0, 0, 0, 0);
	    frame.getContentPane().add(label);
	    
	    Label label_1 = new Label("Votre compte LOCOLOSSE");
	    label_1.setForeground(Color.RED);
	    label_1.setBackground(SystemColor.menu);
	    label_1.setFont(new Font("DialogInput", Font.BOLD, 24));
	    label_1.setBounds(22, 68, 313, 49);
	    frame.getContentPane().add(label_1);
	  }
	}
