public class Vehicule {

    private String nom;
    private int price;


    Vehicule(String nom, int price) {
        this.nom = nom;
        this.price = price;
    }


    public String getNom(){
        return nom;
    }


    public void setNom(String nom){
        this.nom = nom;
    }

    public int getPrix(){
        return price;
    }

    public void setPrix(int price){
        this.price = price;
    }

    public String emmetreSon(){
        return "Song inkonnu";
    }


    public String affichrInformation(){
        return "this the nom "+ this.getNom() +" is "+ this.getPrix() + " the son " + this.emmetreSon();
    }
}
