package theory.collection.homework;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(findNb(1901762086401473409L));
    }
    public static long findNb(long m) {
        long count = 0;
        long sum = 0;
        while(sum < m) {
            System.out.println("=");
            count++;
            sum += (long)(Math.pow(count, 3));
            if (sum == m) {
                break;
            }
        }
        System.out.println(count);
        if (sum > m) {
            return -1;
        }
        return count;
    }
}
