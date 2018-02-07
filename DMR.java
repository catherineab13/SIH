package Princeton_SIR;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class DMR {
    
    private Patient patient;
    private Domicile domicile;
    private String genre;
    private int id;
    private List FichesExamen = new ArrayList<FicheExamen>();
    
    public DMR(String nom, String prenom, String date, String adresse, String ville, int codePostal, String pays, String genre, int id) throws ParseException{
        this.patient = new Patient(nom, prenom, date);
        this.domicile = new Domicile(adresse, ville, codePostal, pays);
        this.genre = genre;
        this.id = id;
    }
    
    private void ajouterFicheExamen(FicheExamen fiche){
        FichesExamen.add(fiche);
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * @return the domicile
     */
    public Domicile getDomicile() {
        return domicile;
    }

    /**
     * @param domicile the domicile to set
     */
    public void setDomicile(Domicile domicile) {
        this.domicile = domicile;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    
}
