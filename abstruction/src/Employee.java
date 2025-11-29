abstract class Employee {

    private String nom;
    private String email;
    private double salary;


    Employee(String nom, String email, double salary) {
        this.nom = nom;
        this.email = email;
        this.salary = salary;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculerSalary(double porcentage){
        return (this.salary + (this.salary * porcentage));
    }


    public String toString() {
        return  "the name " + this.getNom() + " email " + this.getEmail() + " salary " + this.getSalary();
    }
}

