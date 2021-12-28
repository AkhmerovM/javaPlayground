package theory.classLoader;

import jdk.net.NetworkPermission;
import org.springframework.core.KotlinDetector;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Rabbit rabbit = new Rabbit("Pasha");
        System.out.println(Thread.activeCount());
        // bootstrap
        System.out.println(ArrayList.class.getClassLoader());
        System.out.println(Class.class.getClassLoader());
        System.out.println(NetworkPermission.class.getClassLoader());
        System.out.println(Future.class.getClassLoader());
        //platform/extension
        System.out.println(DriverManager.class.getClassLoader());
        // app/system
        Class<Rabbit> clazz = (Class<Rabbit>) rabbit.getClass();
        System.out.println(clazz.getClassLoader());
        System.out.println(Main.class.getClassLoader());
        System.out.println(KotlinDetector.class.getClassLoader());

    }
}
class Rabbit {
    private String name;

    public Rabbit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
