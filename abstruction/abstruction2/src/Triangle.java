public class Triangle extends Figure {

    private double a, b, c;

    public Triangle(String nom, double a, double b, double c) {
        super(nom);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculerAire() {
        double s = (a + b + c) / 2;         // formule de Héron
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculerPerimetre() {
        return a + b + c;
    }
}
