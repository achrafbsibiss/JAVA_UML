//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ingenieur ing = new Ingenieur("XTN", "xtn@gmail.com", 23000);
        Manager man = new Manager("hoba", "spirit@gmail.com", 12000);

        ing.setEmail("figo@gmail.com");


        System.out.println(ing.toString());
        System.out.println(man.toString());
    }
}