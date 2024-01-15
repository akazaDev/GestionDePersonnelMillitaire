package actions.peronnel;

import java.util.Scanner;

public class AttribuerCompétence {

    public AttribuerCompétence() {
        System.out.println("Attribuer une compétence");

        Scanner sc = new Scanner(System.in);

        int numeroIdentification = sc.nextInt();
        String competence = sc.nextLine();

    }
}

