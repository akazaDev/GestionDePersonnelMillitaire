package actions.peronnel;

import actions.database.RemoveFromDataBase;

import java.util.Scanner;

public class SuppimerEmployé {

    public SuppimerEmployé() {
        System.out.println("Supprimer un employé");
        System.out.println("Numéro d'identification: ");

        Scanner sc = new Scanner(System.in);
        int numeroIdentification = sc.nextInt();

        new RemoveFromDataBase(numeroIdentification);
        System.out.println("Employé supprimé");
    }
}
