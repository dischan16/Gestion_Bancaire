package GestionBancaire;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;


public class GestionBancaire {
  private JFrame frame;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
            	GestionBancaire window = new GestionBancaire();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public GestionBancaire() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    this.frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 793, 316);
    this.frame.setDefaultCloseOperation(2);
    JPanel panel = new JPanel();
    panel.setForeground(Color.GRAY);
    panel.setBackground(SystemColor.inactiveCaptionBorder);
    panel.setBorder(new LineBorder(new Color(0, 0, 0)));
    this.frame.getContentPane().add(panel, "Center");
    panel.setLayout(null);
    
    JLabel lblNewLabel_5 = new JLabel("Bienvenue dans la banque du futur. Faites de bon choix en utilisant nos services hors normes.\r\n");
    lblNewLabel_5.setBounds(10, 120, 753, 54);
    panel.add(lblNewLabel_5);
    lblNewLabel_5.setFont(new Font("Sitka Display", Font.PLAIN, 18));
    
    JLabel lblNewLabel = new JLabel("");
   
    lblNewLabel.setBounds(42, 8, 95, 99);
    panel.add(lblNewLabel);
    
    JLabel lblStarkBank = new JLabel("LOCOLOSSE BANK");
    lblStarkBank.setForeground(Color.RED);
    lblStarkBank.setFont(new Font("Perpetua", Font.BOLD, 65));
    lblStarkBank.setBounds(117, 17, 575, 87);
    panel.add(lblStarkBank);
    
    JLabel lblMerci = new JLabel("Vous pouvez faire votre choix sur le menu d'en haut , Merci cher client.");
    lblMerci.setFont(new Font("Sitka Display", Font.PLAIN, 18));
    lblMerci.setBounds(10, 153, 602, 41);
    panel.add(lblMerci);
    JMenuBar menuBar = new JMenuBar();
    menuBar.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setJMenuBar(menuBar);
    
    JLabel label = new JLabel("");
    menuBar.add(label);
    JMenu mnNewMenu = new JMenu("Créer");
    mnNewMenu.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu);
    JMenuItem NouveauCompte = new JMenuItem("Nouveau Compte");
    NouveauCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  GestionBancaire.this.frame.setVisible(false);
        	  Créer_compte.main(null);
          }
        });
    NouveauCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu.add(NouveauCompte);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JMenuItem AffichertToutCompte = new JMenuItem("Tous les comptes");
    AffichertToutCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  GestionBancaire.this.frame.setVisible(false);
        	  Affichage.main(null);
          }
        });
    AffichertToutCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AffichertToutCompte);
    JSeparator separator_2 = new JSeparator();
    mnNewMenu_2.add(separator_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Un type de compte / un compte sp");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  GestionBancaire.this.frame.setVisible(false);
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
        	  GestionBancaire.this.frame.setVisible(false);
        	  Supprimer.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(SupprimerCompte);
  }
}
