public class Personne {
    private String name;
    private int age;
    private  String email;
    private int number;

    public Personne(String name, int age, String email,  int number) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.number = number;
    }


    public  int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public  String toString(){
        return  "Person name: " + this.getName() + " ,the age is " + this.getAge() + " ,the email is " + this.getEmail();
    }
}

