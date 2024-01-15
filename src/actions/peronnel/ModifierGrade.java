package actions.peronnel;

import actions.database.UpdateGrade;

import java.util.Scanner;

public class ModifierGrade {
    public ModifierGrade() {
        System.out.println("Modifier le grade d'un employé");
        System.out.println("Numéro d'identification: ");
        Scanner sc = new Scanner(System.in);
        int numeroIdentification = sc.nextInt();
        System.out.println("Nouveau grade: ");
        String grade = sc.next();
        new UpdateGrade(numeroIdentification, grade);
        System.out.println("Grade modifié");
    }
}
