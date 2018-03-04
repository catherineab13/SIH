package Princeton_SIR;

import java.util.ArrayList;
import java.util.List;

public class DMR {
    
    private Patient patient;
    private List fichesExamen;

    public DMR(Patient patient) {
        this.patient = patient;
        this.fichesExamen = new ArrayList<FicheExamen>();
    }

    private void ajouterFicheExamen(FicheExamen fiche) {
        fichesExamen.add(fiche);
    }
}
