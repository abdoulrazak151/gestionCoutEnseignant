package ne.futurInnov;

public class Chercheur<salaire> extends Enseignant{
    public Chercheur() {
        super();
    }

    final  int salaire=2000;
    @Override
     public int salaire(){
         if(getNbreHeure()<=192){
             return salaire*12;
         }
         else{
             return salaire*12 + (getNbreHeure()-192)*40;
         }
     }

}
