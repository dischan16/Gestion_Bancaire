package GestionBancaire;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TypeDeCompte {
  private JFrame frame;
  
  private JTable table;
  
  private JTextField Type;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
            	TypeDeCompte window = new TypeDeCompte();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public TypeDeCompte() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    frame.getContentPane().setBackground(SystemColor.activeCaption);
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 1200, 660);
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
        	  TypeDeCompte.this.frame.setVisible(false);
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
        	  TypeDeCompte.this.frame = new JFrame("quitter");
            if (JOptionPane.showConfirmDialog(TypeDeCompte.this.frame, "Voulez-vous réelement quitter l'appli Banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    mnNewMenu_1.add(Quitter);
    JMenu mnCrer = new JMenu("Créer");
    mnCrer.setFont(new Font("Segoe UI", 0, 15));
    mnCrer.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnCrer);
    JMenuItem mntmUnNouveauCompte = new JMenuItem("Un nouveau compte");
    mntmUnNouveauCompte.setFont(new Font("Segoe UI", 0, 15));
    mnCrer.add(mntmUnNouveauCompte);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JSeparator separator_2 = new JSeparator();
    mnNewMenu_2.add(separator_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Tout les comptes");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  TypeDeCompte.this.frame.setVisible(false);
        	  Affichage.main(null);
          }
        });
    AfficherTypeCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AfficherTypeCompte);
    JMenu mnNewMenu_3 = new JMenu("Modifier");
    mnNewMenu_3.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_3);
    JSeparator separator_3 = new JSeparator();
    mnNewMenu_3.add(separator_3);
    JMenuItem SupprimerCompte = new JMenuItem("Supprimer un compte");
    SupprimerCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  TypeDeCompte.this.frame.setVisible(false);
            Supprimer.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(SupprimerCompte);
    this.frame.getContentPane().setLayout((LayoutManager)null);
    frame.getContentPane().setLayout(null);
    frame.getContentPane().setLayout(null);
    frame.getContentPane().setLayout(null);
    frame.getContentPane().setLayout(null);
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(12, 150, 1158, 394);
    this.frame.getContentPane().add(scrollPane);
    this.table = new JTable();
    this.table.setModel(new DefaultTableModel(new Object[0][], (Object[])new String[] { 
            "NoCompte", "Id", "Nom", "Prenom", 
            "D.O.B", "Adresse", "Sexe", "Type de Compte", "Solde", "ID 2 (C.joint)", 
            "Taux(C.epargne)" }));
    scrollPane.setViewportView(this.table);
    JButton btnAfficher = new JButton("Voir Compte");
    btnAfficher.setFont(new Font("Tahoma", Font.BOLD, 15));
    btnAfficher.addActionListener(new ActionListener() {
          @SuppressWarnings("resource")
		public void actionPerformed(ActionEvent e) {
            File writter = new File("search.dat");
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
                if (line.contains(TypeDeCompte.this.Type.getText().toUpperCase())) {
                  fileWritter.write(line);
                  fileWritter.write("\n");
                } 
              } 
              fileWritter.close();
            } catch (Exception f) {
              f.printStackTrace();
            } 
            String filePath = "search.dat";
            File file = new File(filePath);
            try {
              FileReader fr = new FileReader(file);
              @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
              DefaultTableModel model = (DefaultTableModel)TypeDeCompte.this.table.getModel();
              Object[] lines = br.lines().toArray();
              int i;
              for (i = 0; i < lines.length; i++);
              for (i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(" ");
                model.addRow((Object[])row);
              } 
            } catch (FileNotFoundException fileNotFoundException) {}
            TypeDeCompte.this.Type.setText("");
          }
        });
    btnAfficher.setBounds(249, 117, 163, 23);
    this.frame.getContentPane().add(btnAfficher);
    JLabel lblNewLabel = new JLabel("Recherche d'un type de compte :");
    lblNewLabel.setForeground(SystemColor.text);
    lblNewLabel.setFont(new Font("Comic Sans MS", Font.ITALIC, 35));
    lblNewLabel.setBounds(386, 10, 552, 45);
    this.frame.getContentPane().add(lblNewLabel);
    this.Type = new JTextField();
    this.Type.setBounds(50, 118, 189, 22);
    this.frame.getContentPane().add(this.Type);
    this.Type.setColumns(10);
  }
}
