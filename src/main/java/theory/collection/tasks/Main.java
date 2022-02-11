package theory.collection.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    private static List<Integer> removeEven(List<Integer> list) {
        return list.stream().filter(elem -> elem % 2 != 0).collect(Collectors.toList());
    }

    public static int countUnique(List<Integer> list) {
        return new HashSet<Integer>(list).size();
    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet();
        for (String s : map.keySet()) {
            set.add(map.get(s));
        }
        return set.size() == map.size();
    }

    public static String func(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        Map<Integer, Integer> map3 = new HashMap<>(map1);
        for (Integer key : map2.keySet()) {
            if (map2.containsKey(key)) {
                map3.put(key, map2.get(key) + map3.get(key));
            }
        }

        String output = "";
        for (Integer key : map3.keySet()) {
            if (key == 0) {

            }
            output += map3.get(key) + "x^" + key + "+";
        }
        return output;
    }
}
