package personnel;

import java.util.List;

public class Personnel {
    private String nom;
    private String prenom;
    private int numeroIdentification;
    private String grade;
    private List<String> competences;

    //constructeur
    public Personnel() {
    };

    public Personnel(String nom, String prenom, int numeroIdentification, String grade, List<String> competences) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroIdentification = numeroIdentification;
        this.grade = grade;
        this.competences = competences;
    }

    //getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNumeroIdentification() {
        return numeroIdentification;
    }

    public String getGrade() {
        return grade;
    }

    public List<String> getCompetences() {
        return competences;
    }

    //setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumeroIdentification(int numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCompetences(List<String> competences) {
        this.competences = competences;
    }

    public void ajouterCompetence(String competence) {
        this.competences.add(competence);
    }

    public void supprimerCompetence(String competence) {
        this.competences.remove(competence);
    }



    //toString
    @Override
    public String toString() {
        return "Personnel{" + "nom=" + nom + ", prenom=" + prenom + ", numeroIdentification=" + numeroIdentification + ", grade=" + grade + ", competences=" + competences + '}';
    }
}
