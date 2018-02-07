package Princeton_SIR;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Patient {
    
    private DateFormat patternDateDeNaissance = new SimpleDateFormat("yyyy-MM-dd");
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    
    public Patient(String nom, String prenom, String date) throws ParseException{
        this.nom = nom;
        this.prenom = prenom;
        dateDeNaissance = ((Date)patternDateDeNaissance.parse(date));
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
    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * @param dateDeNaissance the dateDeNaissance to set
     */
    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
}