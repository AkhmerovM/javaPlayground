
import theory.Test1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 0, 9, 10);

        List<Integer> newAr = array.stream().sorted().collect(Collectors.toList());
        int index = 0;
        System.out.println(newAr);
        for (int i = 0; i < array.size(); i++) {
            int a = newAr.get(i);
            if (i != a) {
                index = i;
                break;
            }
        }
        Test1 test1 = new Test1();
        test1.setCount(2);

         //        System.out.print(index);
    }
}