package theory.collection.homework;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {6,6,6,6, 6, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num: numbers) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}
