package theory.collection.linkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Human> linkedList = new LinkedList<>();

        Human human1 = new Human("Max", 21);
        Human human2 = new Human("Pasha", 19);
        Human human3 = new Human("Sasha", 23);
        linkedList.add(human1);
        linkedList.add(human2);
        linkedList.add(human3);
        System.out.println(linkedList.offerFirst(human3));
        System.out.println(linkedList.getLast().getName());
        System.out.println(linkedList.getFirst().getName());
        System.out.println(linkedList.size());
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