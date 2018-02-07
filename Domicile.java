package Princeton_SIR;

public class Domicile {

    private String adresse;
    private String ville;
    private int codePostal;
    private String pays;

    public Domicile(String adresse, String ville, int codePostal, String pays) {
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.pays = pays;
    }

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
