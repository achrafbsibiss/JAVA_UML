public abstract class Figure {

    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double calculerAire();

    public abstract double calculerPerimetre();

    // Méthode pour afficher les détails
    public void afficherDetails() {
        System.out.println("Nom de la figure : " + nom);
        System.out.println("Aire : " + calculerAire());
        System.out.println("Périmètre : " + calculerPerimetre());
    }
}
