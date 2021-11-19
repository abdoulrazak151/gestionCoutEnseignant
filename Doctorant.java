package ne.futurInnov;

public class Doctorant extends Enseignant{

    @Override
    public int salaire() {
        if(getNbreHeure()<=96){
            return getNbreHeure()*30;
        }
        return 30*96;
    }
}
