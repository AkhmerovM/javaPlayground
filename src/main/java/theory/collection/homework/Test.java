package theory.collection.homework;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //1
//        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8);
//        System.out.println(removeEven(list1));
        //2
//        List<Integer> list = Arrays.asList(3, 7, 3, -1,2 , 3, 7, 2, 15, 15);
//        System.out.println(countUnique(list));
        //3
//        Map<String, String> hashMap = new HashMap<>();
//        hashMap.put("asd", "asfsss");
//        hashMap.put("asd2", "as21sss");
//        hashMap.put("as3d", "ass3ss");
//        System.out.println(isUnique(hashMap));
        //4
        Map<Integer, Integer> map1 = new HashMap<>(Map.of(1, 2,3,4,5,6,7,8,9, 10));
        Map<Integer, Integer> map2 = new HashMap<>(Map.of(0,3,5,6,9,4,8,3,3, 8));

        Map<Integer, Integer> map3 = new HashMap<>(map1);

        for (Integer key: map2.keySet()) {
            if(map3.containsKey(key)) {
                map3.put(key, map3.get(key) + map2.get(key));
            } else {
                map3.put(key, map2.get(key));
            }
        }
        Map<Integer, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.putAll(map3);
        for(Integer key: treeMap.keySet()) {
            if (key == 0) {
                System.out.print(treeMap.get(key));
            } else if (key == 1) {
                System.out.print(treeMap.get(key) + "x" + "+");
            } else {
                System.out.print(treeMap.get(key) + "x^" + key + "+");
            }
        }
    }

    public static List<Integer> removeEven(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                list1.add(integer);
            }
        }
        return list1;
    }
    private static int countUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.size();
    }
    private static boolean isUnique(Map<String, String>map ) {
        int count = map.values().size();
        Set<String> hashSet = new HashSet<>(map.values());
        return count == hashSet.size();
    }

}
