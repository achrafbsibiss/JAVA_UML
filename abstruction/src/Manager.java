public class Manager extends Employee {

    Manager(String nom, String email, double salary){
        super(nom, email, salary);
    }

    @Override
    public String toString(){
        return "Manager "+ super.toString() + " this with the ogmontation " + this.calculerSalary(0.15);
    }
}
