import java.util.Date;

public class Voiture extends Vehicule {

    private Date date;
    private String Model;

    public Voiture(Date date, String Model, String nom, int price) {
        super(nom, price);
        this.date = date;
        this.Model = Model;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    @Override
    public String emmetreSon(){
        return "Voiture song";
    }

    @Override
    public String affichrInformation(){
        return  super.affichrInformation() + " the Model " + this.Model + " is " + this.date;
    }
}
