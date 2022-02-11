package playground;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Array
        Integer[] ar = {1,3,5,6,7,8,9,9,3,2,4,6,7};
        int[] a = Arrays.stream(new int[]{1,2,3,4}).toArray();

        //List
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new LinkedList<Integer>(list);
        //Stream
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        Stream<Integer> stream2 = new LinkedList<Integer>().stream();
        Stream<Integer> stream3 = Arrays.stream(new Integer[]{2, 3});
        Stream<Integer> stream4 = Stream.empty();
        //transitions
        //list > Array
//        Integer[] a = list.toArray();
        //list > Stream
        Stream<Integer> stream1 = list.stream();
        //stream > List
        List<Integer> list1 = stream.collect(Collectors.toList());
        //stream > array

        //array > stream
        //array > List



        double h = 30; double bounce=0.66; double window = 1.5;
        double height = h;
        int count = 0;
        while(height > window) {
            count++;
            height*=bounce;
            System.out.println(height);
        }
        System.out.println(count*2);
    }

}
