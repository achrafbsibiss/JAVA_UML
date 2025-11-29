public class Rectangle extends Figure{

    private double lon;
    private double lat;

    Rectangle(String nom, double lon, double lat){
        super(nom);
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return  lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public double calculerAire() {
        return  this.getLon() + this.getLat();
    }

    @Override
    public double calculerPerimetre() {
        return  (2 * (this.getLon() + this.getLat()));
    }
}
