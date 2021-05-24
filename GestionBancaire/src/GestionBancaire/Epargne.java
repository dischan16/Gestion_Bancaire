package GestionBancaire;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Epargne extends Courant {
  private JFrame frame;
  
  public float taux;
  
  public String[] creerCompte(String id, String Nom, String Prenom, String dob, String sexe, String adresse, String TypeCompte, String Taux, String solde) {
    long nocompte = 0L;
    solde = "0";
    TypeCompte = "EPARGNE";
    Epargne client = new Epargne();
    String idconvert = id;
    String nocompteconvert = "000" + idconvert;
    nocompte = Long.valueOf(nocompteconvert).longValue();
    try {
      client.id = Long.parseLong(id);
      client.setNoCompte(nocompte);
      client.nom = Nom;
      client.prenom = Prenom;
      client.adresse = adresse;
      client.sexe = sexe;
      client.setTypeCompte(TypeCompte);
      client.setSolde(Double.parseDouble(solde));
      client.taux = Float.parseFloat(Taux);
      String[] Split = dob.split("-");
      int jj = Integer.parseInt(Split[0]);
      int mm = Integer.parseInt(Split[1]);
      int aaaa = Integer.parseInt(Split[2]);
      if (jj < 0 || mm < 0 || aaaa < 1900)
        JOptionPane.showMessageDialog(this.frame, "date invalide...veuillez réesayer"); 
      if (jj > 31 || mm > 12 || aaaa > 2100)
        JOptionPane.showMessageDialog(this.frame, "date invalide...veuillez réesayer"); 
      client.dob = dob;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this.frame, "Erreur caractères invalides détecté...veuillez réesayer");
    } 
    String[] TabEpargne = { 
        String.valueOf(client.getNoCompte()), " ", String.valueOf(client.id), " ", client.nom, 
        " ", client.prenom, " ", client.dob, " ", 
        client.adresse, " ", client.sexe, " ", 
        client.getTypeCompte(), " ", String.valueOf(client.getSolde()), " ", "-", " ", 
        String.valueOf(client.taux), "\n" };
    return TabEpargne;
  }
}