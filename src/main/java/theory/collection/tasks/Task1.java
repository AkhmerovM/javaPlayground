package theory.collection.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
//        1, 246, 2, 123, 3, 82, 6, 41 are the divisors of number 246. Squaring these divisors we get: 1, 60516, 4, 15129, 9, 6724, 36, 1681. The sum of these squares is 84100 which is 290 * 290.
//
//        Task
//        Find all integers between m and n (m and n integers with 1 <= m <= n) such that the sum of their squared divisors is itself a square.
//
//        We will return an array of subarrays or of tuples (in C an array of Pair) or a string. The subarrays (or tuples or Pairs) will have two elements: first the number the squared divisors of which is a square and then the sum of the squared divisors.
//        list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
//        list_squared(42, 250) --> [[42, 2500], [246, 84100]]
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        System.out.println(SumSquaredDivisors.listSquared(1, 250));
    }
}
class SumSquaredDivisors {

    public static String listSquared(long m, long n) {
        Map<Long, Long> digits = new TreeMap<>();
        for (long i = m; i < n; i++) {
            if (i == 1) {
                digits.put(i, i);
                continue;
            }
            List<Long> divisors = findDivisors(i);
            if (divisors.size() > 1) {
                long square = divisors.stream().reduce(0L, (sum, val) -> sum + (long) Math.pow(val, 2)) + (long) Math.pow(i, 2);
                if (Math.sqrt(square) % 1 == 0) {
                    digits.put(i, square);
                }
            }
        }
        List<List<Long>> list = new ArrayList<>();
        for(Long key : digits.keySet()) {
            List<Long> newList = new ArrayList<>();
            newList.add(key);
            newList.add(digits.get(key));
            list.add(newList);
        }
        return list.toString();
    }
    public static List<Long> findDivisors(long l) {
        List<Long> list = new ArrayList<>();
        if (l == 1) {
            list.add(1L);
            return list;

        }
        for (long i = 1; i <= l / 2; i++) {
            if (l % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}