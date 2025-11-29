public class Ingenieur extends Employee{

    public Ingenieur(String nom, String email, double salary){
        super(nom, email, salary);
    }

    @Override
    public String toString(){
        return "Ingenieur "+ super.toString() + " this with the ogmontation " + this.calculerSalary(0.15);
    }
}
