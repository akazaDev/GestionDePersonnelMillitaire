package actions.peronnel;

import actions.database.AddToDataBase;
import personnel.Personnel;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AjouterEmployé {
    public AjouterEmployé() {
        String nom;
        String prenom;
        int numeroIdentification;
        String grade;
        List<String> competences;

        Scanner sc = new Scanner(System.in);
        Scanner ec = new Scanner(System.in);

        System.out.println("Ajouter un employé");

        System.out.println("Nom: ");
        nom = sc.nextLine();

        System.out.println("Prénom: ");
        prenom = sc.nextLine();

        System.out.println("Numéro d'identification: ");
        numeroIdentification = ec.nextInt();

        System.out.println("Grade: ");
        grade = sc.nextLine();

        System.out.println("Compétences: ");
        competences = Collections.singletonList(sc.nextLine());

        Personnel personnel = new Personnel(nom, prenom, numeroIdentification, grade, competences);
        new AddToDataBase(personnel);
    }

}