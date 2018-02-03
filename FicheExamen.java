package Princeton_SIR;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FicheExamen {
    
    public enum TypeImage {
        Radiographie,
        Scanner,
        IRM;	
    }
    private DateFormat patternDateExamen = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
    
    private int numeroExamen;
    private TypeImage typeImage;
    private Date dateExamen;
    private String praticienHospitalierResponsable;
    private String compteRendu;
    
    public FicheExamen(int numeroExamen,TypeImage typeImage,String dateExamen,String praticienHospitalierResponsable, String compteRendu) throws ParseException{
        this.numeroExamen = numeroExamen;
        this.typeImage = typeImage;
        this.dateExamen = ((Date)patternDateExamen.parse(dateExamen));
        this.praticienHospitalierResponsable = praticienHospitalierResponsable;
        this.compteRendu = compteRendu;
    }
    
    /**
     * @return the numeroExamen
     */
    public int getNumeroExamen() {
        return numeroExamen;
    }

    /**
     * @param numeroExamen the numeroExamen to set
     */
    public void setNumeroExamen(int numeroExamen) {
        this.numeroExamen = numeroExamen;
    }

    /**
     * @return the typeImage
     */
    public TypeImage getTypeImage() {
        return typeImage;
    }

    /**
     * @param typeImage the typeImage to set
     */
    public void setTypeImage(TypeImage typeImage) {
        this.typeImage = typeImage;
    }

    /**
     * @return the dateExamen
     */
    public Date getDateExamen() {
        return dateExamen;
    }

    /**
     * @param dateExamen the dateExamen to set
     */
    public void setDateExamen(Date dateExamen) {
        this.dateExamen = dateExamen;
    }

    /**
     * @return the praticienHospitalierResponsable
     */
    public String getPraticienHospitalierResponsable() {
        return praticienHospitalierResponsable;
    }

    /**
     * @param praticienHospitalierResponsable the praticienHospitalierResponsable to set
     */
    public void setPraticienHospitalierResponsable(String praticienHospitalierResponsable) {
        this.praticienHospitalierResponsable = praticienHospitalierResponsable;
    }
}
