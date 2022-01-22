package theory.annotation;
 
public class Main {
    public static void main(String[] args) {
        Man man = new Man("Sasha", "Ivanov");
        Man man2 = new Man("Sasha", "Ivanov");
        System.out.println(man.equals(man2));
    }
}
class Man {
    @MyAnnotation(name = "Privet")
    public String firstname;
    private String lastname;

    public Man(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
