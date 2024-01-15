package actions.peronnel;

import java.util.Scanner;

public class GestionCompetences {

    public void competenceMenu(){
        System.out.println("1. Attribuer une compétence");
        System.out.println("2. Planifier une formation");
        System.out.println("3. Retour");

        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                new AttribuerCompétence();
                break;
            case 2:
                System.out.println("Planifier une formation");
                break;
            case 3:
                System.out.println("Retour");
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }

   /* public Personnel retrouverSoldat(int numeroIdentification) {
        if (this.numeroIdentification == numeroIdentification) {
            return this;
        }
        return null;
    }*/

    // Méthodes pour gérer les compétences et les formations
    public void attribuerCompetence(int numeroIdentification, String competence) {

    }

    public void planifierFormation(int numeroIdentification, String formation) {
        // Logique de planification de la formation pour le personnel
    }

    // Autres méthodes selon les besoins
}
