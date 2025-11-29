public class Moto extends Vehicule{

    private String marque;
    private int puissance;

    Moto (String marque, int puissance, String nom, int price) {
        super(nom, price);
        this.marque = marque;
        this.puissance = puissance;
    }


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public String emmetreSon(){
        return "Moto song";
    }

    @Override
    public String affichrInformation(){
        return  super.affichrInformation() + " the MArque " + this.getMarque() + " is  Puissance" + this.getPuissance();
    }
}
