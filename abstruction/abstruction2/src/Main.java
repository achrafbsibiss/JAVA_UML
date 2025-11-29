//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figure f1 = new Cercle("Cercle 1", 5.0);
        Figure f2 = new Rectangle("Rectangle 1", 4.0, 3.0);
        Figure f3 = new Triangle("Triangle 1", 3.0, 4.0, 5.0);

        // Affichage des détails
        f1.afficherDetails();
        f2.afficherDetails();
        f3.afficherDetails();
    }
}