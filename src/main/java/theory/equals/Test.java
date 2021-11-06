package theory.equals;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Cat cat  = new Cat("Keks", 12);
        Cat cat3  = new Cat("Keks", 12);
        Cat cat2  = new Cat("Sasha", 4);
        System.out.println(cat.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat.equals(cat3));
    }
}
class Cat {
    private String name;
    private int old;
    public Cat(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return old == cat.old && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, old);
    }
}