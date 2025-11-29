import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Bing", 1234, "474", 13243453);
        Voiture voiture = new Voiture(new Date(), "C2020", "mercedec", 234);
        Moto motor = new Moto("Yammaha", 353, "H-2", 1231);

        System.out.println(avion.affichrInformation());
        System.out.println(voiture.affichrInformation());
        System.out.println(motor.affichrInformation());

    }
}