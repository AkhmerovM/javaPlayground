package theory.collection.treeSet;

import java.util.LinkedList;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Human> treeSet = new TreeSet<>();
        Human human1 = new Human("Max", 21);
        Human human2 = new Human("Pasha", 19);
        Human human3 = new Human("Sasha", 23);
      treeSet.add(human1);
      treeSet.add(human2);
      treeSet.add(human3);
      treeSet.add(human1);
        System.out.println(treeSet);
    }
}

class Human implements Comparable<Human> {
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
    public int compareTo(Human h1) {
        return this.age - h1.getAge();
    }
}