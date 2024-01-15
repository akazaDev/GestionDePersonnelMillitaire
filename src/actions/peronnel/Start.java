package actions.peronnel;
import personnel.GestionPersonnel;
import java.util.Scanner;

public class Start {

    public static void start () {
        int choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenu sur le Programme de gestion de Personnel Militaire");
        System.out.println("Veuillez choisir une action à effectuer");
        System.out.println("1. Gestion de personnel");
        System.out.println("2. Gestion des compétences et des formations");
        System.out.println("3. Gestion des affectations");
        System.out.println("4. Gestion des rotations");
        System.out.println("5. Quitter");

        while (true) {
            System.out.print("Votre choix: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    GestionPersonnel.switchMenu();
                    break;
                /*case 2:
                    GestionCompetences gestionCompetences = new GestionCompetences();
                    gestionCompetences.start();
                    break;
                case 3:
                    AffectationsRotations affectationsRotations = new AffectationsRotations();
                    affectationsRotations.start();
                    break;
                case 4:
                    AffectationsRotations affectationsRotations2 = new AffectationsRotations();
                    affectationsRotations2.start();
                    break;
                case 5:
                    System.out.println("Merci d'avoir utilisé le Programme de gestion de Personnel Militaire");
                    System.exit(0);
                default:
                    System.out.println("Choix invalide");*/
            }
        }
    }
}
