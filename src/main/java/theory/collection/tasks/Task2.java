package theory.collection.tasks;

import java.util.*;

public class Task2 {
//    A friend of mine takes the sequence of all numbers from 1 to n (where n > 0).
//    Within that sequence, he chooses two numbers, a and b.
//    He says that the product of a and b should be equal to the sum of all numbers in the sequence, excluding a and b.
//    Given a number n, could you tell me the numbers he excluded from the sequence?
//    The function takes the parameter: n (n is always strictly greater than 0) and returns an array or a string (depending on the language) of the form:
//
//            [(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or or [{a, b}, ...]
//removNb(26) should return [(15, 21), (21, 15)]
    public static void main(String[] args) {
        System.out.println(main2());
    }
    public static List<long[]> main2() {
        int n = 26;
        List<long[]> list = new ArrayList<>();
        List<Long> list2 = new LinkedList<>();
        for (int a = 1; a <= n; a++) {
            list2.add(Integer.toUnsignedLong(a));
        }
        for (int a = 0; a <= n ; a++) {
            Long el = list2.remove(0);
            Optional<Long> sum = list2.stream().reduce(Long::sum);

            if (sum.isPresent()) {
                double val = (double)sum.get() / (el + 1);
                if ( val % 1 == 0 && list2.contains((long)val)) {
                    long[] listik = new long[] {el, (long)val};
                    list.add(listik);
                }
            }
            list2.add(el);
        }
        return list;
    }
}
