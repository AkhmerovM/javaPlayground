package theory.collection.hashMap;

import java.util.HashMap;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        HashMap<Human, Integer> hashMap = new HashMap<>();

        Human human1 = new Human("Max", 21);
        Human human2 = new Human("Pasha", 19);
        Human human3 = new Human("Sasha", 23);
        hashMap.put(human1, 1);
        hashMap.put(human3, 3);
        hashMap.put(human2, 2);
        System.out.println(hashMap.compute(human1, (human, integer) -> human.getAge()));
        System.out.println(hashMap);
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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}