public class Avion  extends Vehicule{

    private String company;
    private int vitesseMax;

    public Avion( String company, int vitesseMax, String nom, int price) {
        super(nom, price);
        this.company = company;
        this.vitesseMax = vitesseMax;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public String emmetreSon(){
        return "Avion song";
    }

    @Override
    public String affichrInformation(){
        return  super.affichrInformation() + " the Company " + this.getCompany() + " is VitesseMax()" + this.getVitesseMax();
    }
}
