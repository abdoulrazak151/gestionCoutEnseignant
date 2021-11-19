package ne.futurInnov;

import java.util.ArrayList;
import java.util.List;

public class Universite {
    private String nom_universite;
    private int pourcentage;
    private List<Enseignant> enseignants=new ArrayList<Enseignant>();

    public String getNom_universite() {
        return nom_universite;
    }

    public void setNom_universite(String nom_universite) {
        this.nom_universite = nom_universite;
    }

    public List<Enseignant> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Enseignant enseignants) {
        this.enseignants.add(enseignants);
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }
}
