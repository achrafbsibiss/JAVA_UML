public class Cercle extends Figure{

    private double rayon;

    public Cercle(String nom, double rayon){
        super(nom);
        this.rayon = rayon;
    }

    public double getRayon(){
        return rayon;
    }

    public void setRayon(double rayon){
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return (Math.PI * Math.pow(this.getRayon(), 2));
    }

    @Override
    public double calculerPerimetre(){
        return (Math.PI * this.getRayon() * 2);
    }


}
