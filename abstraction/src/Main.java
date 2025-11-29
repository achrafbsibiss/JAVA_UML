//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Adherent adherent = new Adherent(12, "Achraf", 23, "ach2gmail.com", 65);
        Auteur auteur = new Auteur(12, "Toto", 63, "higo", 874);
        Livre livre = new Livre(129, "Desing System", auteur);
        System.out.println( adherent.toString());
        System.out.println( auteur.toString());
        System.out.println( livre.toString());


    }
}