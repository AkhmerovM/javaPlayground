package theory.collection.myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>(5);
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        for (int a: myList) {
            System.out.println(a);
        }
    }
}
class MyList<T> implements Iterable<T>  {
    private T[] data;
    private int size;

    public int getSize() {
        return size;
    }

    public MyList(int size) {
        this.data = (T[])new Object[size];
    }
    public void add(T element) {
        data[size++] = element;
    }
    public T get(int index) {
        return data[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
    class ListIterator implements Iterator<T> {
        public int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return data[currentIndex++];
        }
    }

}