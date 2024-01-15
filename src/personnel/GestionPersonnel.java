package personnel;

import actions.peronnel.AjouterEmployé;
import actions.peronnel.ModifierGrade;
import actions.peronnel.SuppimerEmployé;

import java.util.Scanner;

import static actions.database.AfficherListeEmployees.afficherListeEmployees;

public class GestionPersonnel {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le gestionnaire de personnel");
        switchMenu();
    }

    public static void switchMenu() {
        System.out.println("1. Ajouter un employé");
        System.out.println("2. Supprimer un employé");
        System.out.println("3. Modifier grade d'un employé");
        System.out.println("4. Afficher la liste des employés");
        System.out.println("Choisissez une option: ");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                new AjouterEmployé();
                break;
            case 2:
                new SuppimerEmployé();
                break;
            case 3:
                new ModifierGrade();
                break;
            case 4:
                afficherListeEmployees();
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }
}
