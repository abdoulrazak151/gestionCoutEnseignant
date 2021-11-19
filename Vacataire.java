package ne.futurInnov;

public class Vacataire extends Enseignant{
    private String organisme;

    @Override
    public int salaire(){
        return getNbreHeure()*40;

    }


    public String getOrganisme() {
        return organisme;
    }

    public void setOrganisme(String organisme) {
        this.organisme = organisme;
    }
}
