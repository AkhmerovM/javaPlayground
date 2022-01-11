package theory.annotation;

import jdk.jfr.Name;
//import org.springframework.stereotype.Controller;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Sasha", "Ivanov");
        Man man2 = new Man("Sasha", "Ivanov");
        System.out.println(man.equals(man2));
    }
}
@Name("Maon")
//@Controller
class Man {
    private String firstname;
    private String lastname;

    public Man(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
