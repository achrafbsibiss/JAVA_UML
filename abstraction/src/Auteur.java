public class Auteur extends Personne {
    private int numAuteur;

    public Auteur(int numAuteur, String name, int age, String email,  int number) {
        super(name, age, email, number);
        this.numAuteur = numAuteur;
    }

    public int getNumAuteur() {
        return numAuteur;
    }

    public void setNumAuteur(int numAuteur) {
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString(){
        return super.toString() + " this the numAuteur " + this.getNumAuteur();
    }
}
