package Princeton_SIR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Patient {

    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String sexe;
    private String adresse;
    private String ville;
    private int codePostal;
    private String pays;

    public Patient(String nom, String prenom, String date, String sexe, String adresse, String ville, int codePostal, String pays) {
        this.nom = nom;
        this.prenom = prenom;
        dateDeNaissance = date;
        this.sexe = sexe;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.pays = pays;
    }

    public void ajouterPatientaBDD() {
        try {
            //Connection à la base de données
            String url = "jdbc:mysql://mysql-healthview.alwaysdata.net:3306/healthview_sir?zeroDateTimeBehavior=convertToNull";
            Connection cn = DriverManager.getConnection(url, "152416_sir", "projetsir2018");

            //Créer declaration 
            Statement dec = cn.createStatement();

            //Ajouter un DMR à la base de données
            String requeteAjout = "INSERT INTO Patients (idPatient, nom, prenom, date_naissance, genre, adresse, ville, code_postal, pays) VALUES (NULL, '" + this.getNom() + "', '" + this.getPrenom() + "', '" + this.getDateDeNaissance() + "', '" + this.getSexe() + "', '" + this.getAdresse() + "', '" + this.getVille() + "', '" + this.getCodePostal() + "', '" + this.getPays() + "')";

            dec.executeLargeUpdate(requeteAjout);

            System.out.println("Ajout Réussi");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the dateDeNaissance
     */
    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * @param dateDeNaissance the dateDeNaissance to set
     */
    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the domicile
     */
    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the codePostal
     */
    public int getCodePostal() {
        return codePostal;
    }

    /**
     * @param codePostal the codePostal to set
     */
    public void setCodePostal(int codePostal) {
        if (String.valueOf(codePostal).length() == 5) {
            this.codePostal = codePostal;
        } else {
            System.out.println("Erreur code postal");
        }
    }

    /**
     * @return the pays
     */
    public String getPays() {
        return pays;
    }

    /**
     * @param pays the pays to set
     */
    public void setPays(String pays) {
        this.pays = pays;
    }
}