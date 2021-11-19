package ne.futurInnov;
import java.lang.*;
public  abstract class Enseignant {
    private String nom;
    private String prenom;
    private int nbreHeure;

    protected Enseignant() {
        this.nom = nom;
        this.prenom = prenom;
        this.nbreHeure = nbreHeure;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNbreHeure() {
        return nbreHeure;
    }

    public void setNbreHeure(int nbreHeure) {
        this.nbreHeure = nbreHeure;
    }
    public abstract int salaire();
    }




