package theory.collection.arrayList;

import java.util.ArrayList;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        //List

        //ArrayList
        ArrayList<Human> arrayList = new ArrayList<>();
        Human human1 = new Human("Max", 21);
        Human human2 = new Human("Pasha", 19);
        Human human3 = new Human("Sasha", 23);
        arrayList.add(human1);
        arrayList.add(human3);
        arrayList.add(human2);

        System.out.println(arrayList.contains(human2));
        arrayList.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(arrayList);
        for(Human hum: arrayList) {
            System.out.print(hum.getName());
            System.out.println(hum.getAge());

        }
    }
}
class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
