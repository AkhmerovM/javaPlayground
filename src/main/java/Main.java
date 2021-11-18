import theory.equals.Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        Object[] ar = Arrays.stream(str.split(" ")).map(Integer::parseInt).sorted().toArray();
        System.out.println(ar[ar.length - 1].toString() + " " + ar[0].toString());
    }
}
