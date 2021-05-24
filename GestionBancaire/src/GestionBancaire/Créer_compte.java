package GestionBancaire;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class Créer_compte {
  private JFrame frame;
  
  private JTextField textnom;
  
  private JTextField textprenom;
  
  private JTextField textdob;
  
  private JTextField textsexe;
  
  private JTextField textadresse;
  
  private JTextField texttype;
  
  private String[] array;
  
  private int i = 0;
  
  private JTextField textid2;
  
  private JTextField texttaux;
  
  private JTextField textid;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
            	Créer_compte window = new Créer_compte();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public Créer_compte() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    this.frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 660, 784);
    this.frame.setDefaultCloseOperation(2);
    frame.getContentPane().setLayout(new BorderLayout(0, 0));
    JPanel panel = new JPanel();
    panel.setBackground(SystemColor.inactiveCaptionBorder);
    panel.setBorder(new LineBorder(new Color(0, 0, 0)));
    this.frame.getContentPane().add(panel);
    panel.setLayout(null);
    JButton btnannuler = new JButton(" Annuler");
   
    btnannuler.setBounds(55, 666, 131, 32);
    panel.add(btnannuler);
    btnannuler.setFont(new Font("Dialog", 1, 11));
    btnannuler.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  Créer_compte.this.frame.setVisible(false);
            GestionBancaire.main(null);
          }
        });
    JButton btnreset = new JButton(" Reinitialiser");
    
    btnreset.setBounds(249, 666, 131, 32);
    panel.add(btnreset);
    btnreset.setFont(new Font("Dialog", 1, 11));
    JButton btnNouveau_Compte = new JButton("Cr\u00E9er");
    btnNouveau_Compte.setBounds(427, 666, 131, 32);
    panel.add(btnNouveau_Compte);
    btnNouveau_Compte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String compte = Créer_compte.this.texttype.getText().toUpperCase();
            try {
              Joint joint;
              FileWriter fileWritterjoint;
              BufferedWriter bwjoint;
              Courant courant;
              FileWriter fileWrittercourant;
              BufferedWriter bwcourant;
              Epargne epargne;
              FileWriter fileWritterepargne;
              BufferedWriter bwepargne;
              File banque = new File("banque.dat");
              if (!banque.exists())
                banque.createNewFile(); 
              String str;
              switch ((str = compte).hashCode()) {
                case -833880926:
                  if (!str.equals("EPARGNE"))
                    break; 
                  epargne = new Epargne();
                  Créer_compte.this.array = epargne.creerCompte(Créer_compte.this.textid.getText(), Créer_compte.this.textnom.getText(), Créer_compte.this.textprenom.getText(), 
                		  Créer_compte.this.textdob.getText(), Créer_compte.this.textsexe.getText(), Créer_compte.this.textadresse.getText(), Créer_compte.this.texttype.getText(), Créer_compte.this.texttaux.getText(), "0");
                  fileWritterepargne = new FileWriter(banque.getName(), true);
                  bwepargne = new BufferedWriter(fileWritterepargne);
                  Créer_compte.this.i = 0;
                  for (; Créer_compte.this.i < Créer_compte.this.array.length; Créer_compte.this.i = Créer_compte.this.i + 1)
                    bwepargne.write(Créer_compte.this.array[Créer_compte.this.i]); 
                  bwepargne.close();
                  JOptionPane.showMessageDialog(Créer_compte.this.frame, "Utilisateur crée");
                  Créer_compte.this.frame.setVisible(false);
                  GestionBancaire.main(null);
                  return;
                case 70766698:
                  if (!str.equals("JOINT"))
                    break; 
                  joint = new Joint();
                  Créer_compte.this.array = joint.creerCompte(Créer_compte.this.textid.getText(), Créer_compte.this.textnom.getText(), Créer_compte.this.textprenom.getText(), Créer_compte.this.textdob.getText(), Créer_compte.this.textsexe.getText(), Créer_compte.this.textadresse.getText(), Créer_compte.this.texttype.getText(), Créer_compte.this.textid2.getText(), "0");
                  fileWritterjoint = new FileWriter(banque.getName(), true);
                  bwjoint = new BufferedWriter(fileWritterjoint);
                  Créer_compte.this.i = 0;
                  for (; Créer_compte.this.i < Créer_compte.this.array.length; Créer_compte.this.i = Créer_compte.this.i + 1)
                    bwjoint.write(Créer_compte.this.array[Créer_compte.this.i]); 
                  bwjoint.close();
                  JOptionPane.showMessageDialog(Créer_compte.this.frame, "Utilisateur crée");
                  Créer_compte.this.frame.setVisible(false);
                  GestionBancaire.main(null);
                  return;
                case 1675914526:
                  if (!str.equals("COURANT"))
                    break; 
                  courant = new Courant();
                  Créer_compte.this.array = courant.creerCompte(Créer_compte.this.textid.getText(), Créer_compte.this.textnom.getText(), Créer_compte.this.textprenom.getText(), Créer_compte.this.textdob.getText(), Créer_compte.this.textsexe.getText(), Créer_compte.this.textadresse.getText(), Créer_compte.this.texttype.getText(), "0");
                  fileWrittercourant = new FileWriter(banque.getName(), true);
                  bwcourant = new BufferedWriter(fileWrittercourant);
                  Créer_compte.this.i = 0;
                  for (; Créer_compte.this.i < Créer_compte.this.array.length; Créer_compte.this.i = Créer_compte.this.i + 1)
                    bwcourant.write(Créer_compte.this.array[Créer_compte.this.i]); 
                  bwcourant.close();
                  JOptionPane.showMessageDialog(Créer_compte.this.frame, "Utilisateur crée");
                  Créer_compte.this.frame.setVisible(false);
                  GestionBancaire.main(null);
                  return;
              } 
              JOptionPane.showMessageDialog(Créer_compte.this.frame, "Erreur type de compte incorrect");
            } catch (IOException e1) {
              e1.printStackTrace();
            } 
          }
        });
    btnNouveau_Compte.setFont(new Font("Dialog", 1, 11));
    this.texttaux = new JTextField();
    texttaux.setBounds(12, 603, 618, 35);
    panel.add(texttaux);
    this.texttaux.setHorizontalAlignment(2);
    this.texttaux.setColumns(10);
    JLabel lblNewLabel_2 = new JLabel("Taux en % ");
    lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblNewLabel_2.setBounds(12, 577, 84, 23);
    panel.add(lblNewLabel_2);
    this.textid2 = new JTextField();
    textid2.setBounds(12, 543, 618, 35);
    panel.add(textid2);
    this.textid2.setColumns(10);
    JLabel lblNewLabel_1 = new JLabel("No.Identit\u00E9 de la deuxieme");
    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblNewLabel_1.setBounds(12, 522, 202, 23);
    panel.add(lblNewLabel_1);
    JLabel label_6 = new JLabel("Type de compte  :        ");
    label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
    label_6.setBounds(12, 466, 178, 23);
    panel.add(label_6);
    this.texttype = new JTextField();
    texttype.setBounds(12, 488, 618, 32);
    panel.add(texttype);
    this.texttype.setFont(new Font("Dialog", 0, 15));
    this.texttype.setHorizontalAlignment(2);
    this.texttype.setColumns(10);
    this.textadresse = new JTextField();
    textadresse.setBounds(12, 436, 618, 32);
    panel.add(textadresse);
    this.textadresse.setFont(new Font("Dialog", 0, 15));
    this.textadresse.setHorizontalAlignment(2);
    this.textadresse.setColumns(10);
    JLabel label_4 = new JLabel("Adresse :");
    label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
    label_4.setBounds(12, 415, 97, 19);
    panel.add(label_4);
    this.textsexe = new JTextField();
    textsexe.setBounds(12, 380, 618, 29);
    panel.add(textsexe);
    this.textsexe.setFont(new Font("Dialog", 0, 15));
    this.textsexe.setHorizontalAlignment(2);
    this.textsexe.setColumns(10);
    JLabel lblSexe = new JLabel("Sexe :");
    lblSexe.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblSexe.setBounds(12, 354, 71, 25);
    panel.add(lblSexe);
    this.textdob = new JTextField("");
    textdob.setBounds(12, 324, 618, 32);
    panel.add(textdob);
    this.textdob.setFont(new Font("Dialog", 0, 15));
    this.textdob.setHorizontalAlignment(2);
    this.textdob.setColumns(10);
    JLabel lblDateDeNaissance = new JLabel("Date de naissance :");
    lblDateDeNaissance.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblDateDeNaissance.setBounds(12, 298, 218, 23);
    panel.add(lblDateDeNaissance);
    this.textprenom = new JTextField();
    textprenom.setBounds(12, 269, 618, 32);
    panel.add(textprenom);
    this.textprenom.setHorizontalAlignment(2);
    this.textprenom.setFont(new Font("Dialog", 0, 15));
    this.textprenom.setColumns(10);
    JLabel lblPrnom = new JLabel("Pr\u00E9nom :");
    lblPrnom.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblPrnom.setBounds(12, 247, 97, 23);
    panel.add(lblPrnom);
    this.textnom = new JTextField();
    textnom.setBounds(12, 216, 618, 32);
    panel.add(textnom);
    this.textnom.setHorizontalAlignment(2);
    this.textnom.setFont(new Font("Dialog", 0, 15));
    this.textnom.setColumns(10);
    JLabel lblNomUsuel = new JLabel("Nom :");
    lblNomUsuel.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblNomUsuel.setBounds(12, 190, 124, 25);
    panel.add(lblNomUsuel);
    this.textid = new JTextField();
    textid.setBounds(12, 158, 618, 32);
    panel.add(textid);
    textid.setPreferredSize(new Dimension(50, 100));
    textid.setFont(new Font("Tahoma", Font.PLAIN, 15));
    this.textid.setHorizontalAlignment(2);
    this.textid.setColumns(25);
    JLabel lblNewLabel_3 = new JLabel("No. Identit\u00E9 :");
    lblNewLabel_3.setBounds(12, 133, 141, 23);
    panel.add(lblNewLabel_3);
    lblNewLabel_3.setForeground(new Color(0, 0, 0));
    lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
    JLabel lblNewLabel = new JLabel("Nouveau Compte de LOCOLOSSE");
    lblNewLabel.setBounds(27, 40, 582, 57);
    panel.add(lblNewLabel);
    lblNewLabel.setVerticalAlignment(1);
    lblNewLabel.setForeground(Color.RED);
    lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 35));
    lblNewLabel.setHorizontalAlignment(0);
    
    JLabel lblsiCompteJoint = new JLabel("personne (Si compte joint) :");
    lblsiCompteJoint.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblsiCompteJoint.setBounds(219, 522, 222, 23);
    panel.add(lblsiCompteJoint);
    
    JLabel lblsiComptepargne = new JLabel("(Si compte \u00E9pargne) :");
    lblsiComptepargne.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblsiComptepargne.setBounds(97, 577, 168, 23);
    panel.add(lblsiComptepargne);
    
   
    btnreset.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  Créer_compte.this.textnom.setText("");
        	  Créer_compte.this.textprenom.setText("");
        	  Créer_compte.this.textdob.setText("");
        	  Créer_compte.this.textsexe.setText("");
        	  Créer_compte.this.texttype.setText("");
        	  Créer_compte.this.textadresse.setText("");
          }
        });
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
        	  Créer_compte.this.frame.setVisible(false);
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
        	  Créer_compte.this.frame = new JFrame("quitter");
            if (JOptionPane.showConfirmDialog(Créer_compte.this.frame, "Voulez-vous réelement quitter l'appli Banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    mnNewMenu_1.add(Quitter);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JMenuItem AffichertToutCompte = new JMenuItem("Tous les comptes");
    AffichertToutCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  Créer_compte.this.frame.setVisible(false);
            Affichage.main(null);
          }
        });
    AffichertToutCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AffichertToutCompte);
    JSeparator separator_2 = new JSeparator();
    mnNewMenu_2.add(separator_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Un type de compte / un compte spécifique");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  Créer_compte.this.frame.setVisible(false);
            TypeDeCompte.main(null);
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
        	  Créer_compte.this.frame.setVisible(false);
            Supprimer.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(SupprimerCompte);
  }
}
