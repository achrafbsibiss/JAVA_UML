public class Livre {

    private int ISBN;
    private String name;
    private Auteur auteur;

    Livre(int ISBN, String name, Auteur auteur) {
        this.ISBN = ISBN;
        this.name = name;
        this.auteur = auteur;
    }


    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Auteur getAuteur() {
        return auteur;
    }


    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public String toString(){
        return "The ISBN number is: " + this.getISBN() + " book name: " + this.getName() + " this the info auteur: " + this.getAuteur().toString();
    }

}
