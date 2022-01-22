package theory.streams;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(67,1,2,5,6,8,9,4,2,4,3,11,10,33,67,15,21);
        List<Integer> list1 = list.stream().filter(integer -> integer % 2 == 1 && integer % 5 == 0).collect(Collectors.toList());
        list1.stream().reduce(Integer::sum).ifPresent( sum ->System.out.println(sum/list1.size()));

    }
}
