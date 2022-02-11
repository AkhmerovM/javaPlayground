package theory.collection.tasks;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(CountingDuplicates.duplicateCount("abcdeaB"));
    }
}


 class CountingDuplicates {
    public static int duplicateCount(String text) {
        String[] array = text.toLowerCase(Locale.ROOT).split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i])+1);

            }
        }
        int num = 0;
        Object[] ar = map.values().toArray();
        for (int i = 0; i < ar.length; i++) {
            if ((Integer)ar[i] > 1) {
                num++;
            }
        }
        return num;
    }
}