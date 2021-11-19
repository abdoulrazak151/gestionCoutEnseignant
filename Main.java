package ne.futurInnov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sortie=1;
        Universite univ=new Universite();
        Scanner sc =new Scanner(System.in);
        System.out.print("*****  BIENVENUE SUR LE SYSTEME DE GESTION DE COUT DES ENSEIGNANT D'UNE UNIVERSITE  ******");
        System.out.println("\n\n");
        System.out.println("    PRESENTER PAR : MAHAMADOU MOUSSA ABDOUL RAZAK               NIVEAU: INGENIEUR 3 GL      ECOLE:EST-NIGER");
        System.out.println("\n\n");
        System.out.println("DONNER UN NOM A VOTRE UNIVERSITE : ");
        String universite=new String();
                universite = sc.nextLine();
        univ.setNom_universite(universite);
        System.out.print("Donner le pourcentage de la charge:(par exemple 20% est ecrit 20) :  ");
        System.out.print(univ.getNom_universite()+"-# ");
        int p =sc.nextInt();
        univ.setPourcentage(p);
        while(sortie==1){
            System.out.println("******    UNIVERSITE:  "+univ.getNom_universite()+"   ******");
            System.out.println("       1. AJOUTER UN ENSEIGNANT");
//            System.out.println("       2. SUPPRIMER UN ENSEIGNANT");
            System.out.println("       2. LISTES DES ENSEIGNANTS ET LES COUTS Y AFFERANTS");
            System.out.println("       3. QUITTER");
            System.out.print(univ.getNom_universite()+"~$ ");
            int b=sc.nextInt();
            switch(b){
                case 1:{
                    String prenom;
                    String nom ;
                    System.out.print(" Donner le nom de l'enseignant :");
                    nom =sc.next();
                    System.out.print(" Donner le prenom de l'enseignant : ");
                    prenom=sc.next();

                    System.out.print("Donner le nombre d'heure effectue : ");
                    int heure =sc.nextInt();

                    System.out.println("EST-IL UN Enseignant chercheur (E), un Vacataire (V) ou un Doctorant (D) ? ");
                    System.out.print(univ.getNom_universite()+"-# ");
                    String c=new String();
                    c=sc.next();
                    switch (c){
                        case "E":{
                            Chercheur chercheur=new Chercheur();
                            chercheur.setNom(nom);
                            chercheur.setPrenom(prenom);
                            chercheur.setNbreHeure(heure);
                            univ.setEnseignants(chercheur);
                            break;
                        }
                        case "e":{
                            Chercheur cherche=new Chercheur();
                            cherche.setNom(nom);
                            cherche.setPrenom(prenom);
                            cherche.setNbreHeure(heure);
                            univ.setEnseignants(cherche);
                            break;
                        }
                        case "V":{
                            Vacataire vacataire =new Vacataire();
                            System.out.print("A qu'elle organisme appartient-il ?");
                            System.out.print(univ.getNom_universite()+"-# ");
                            String n=sc.next();
                            vacataire.setOrganisme(n);
                            vacataire.setPrenom(prenom);
                            vacataire.setNbreHeure(heure);
                            vacataire.setNom(nom);
                            univ.setEnseignants(vacataire);
                            break;
                        }
                        case "v":{
                            Vacataire vacataire =new Vacataire();
                            System.out.print("A qu'elle organisme appartient-il ?");
                            System.out.print(univ.getNom_universite()+"-# ");
                            String n=sc.next();
                            vacataire.setOrganisme(n);
                            vacataire.setPrenom(prenom);
                            vacataire.setNbreHeure(heure);
                            vacataire.setNom(nom);
                            univ.setEnseignants(vacataire);
                            break;
                        }
                        case "d": {
                            Doctorant doctorant = new Doctorant();
                            doctorant.setNom(nom);
                            doctorant.setPrenom(prenom);
                            doctorant.setNbreHeure(heure);
                            univ.setEnseignants(doctorant);
                            break;
                        }
                        case "D":{
                            Doctorant doctorant=new Doctorant();
                            doctorant.setNom(nom);
                            doctorant.setPrenom(prenom);
                            doctorant.setNbreHeure(heure);
                            univ.setEnseignants(doctorant);
                            break;
                        }


                    }
                    break;
                }
                case 2:{
                    int somme = 0;
                    System.out.println("la liste des enseignants et les couts induits a l'universite "+univ.getNom_universite());
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("|Nom              Prenom               Nombre d'heure           titre          Cout");
                    for(Enseignant i:univ.getEnseignants()){
                        String titre =new String();
                        if(i instanceof Doctorant) titre=i.getClass().getTypeName();
                        if(i instanceof Chercheur) titre=i.toString();
                        if(i instanceof Vacataire) titre=i.toString();
                        int cout= i.salaire()*(1+ univ.getPourcentage()/100);
                        System.out.println("|"+i.getNom()+"           "+i.getPrenom()+"            "+i.getNbreHeure()+"               "+titre+"     "+cout);
                        somme+=cout;
                    }
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("TOTAL:--------------------------------------------- "+somme);
                    break;
                }
                case 3:{
                    sortie=0;
                    System.out.println("Merci et au revoir !!!");
                    break;
                }
                default:{
                    System.err.println("ce index n'est pas repertorie");
                }
            }
        }


    }
}
