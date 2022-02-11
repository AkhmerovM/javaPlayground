package theory.collection.tasks;
//A child is playing with a ball on the nth floor of a tall building. The height of this floor, h, is known.
//
//        He drops the ball out of the window. The ball bounces (for example), to two-thirds of its height (a bounce of 0.66).
//
//        His mother looks out of a window 1.5 meters from the ground.
//
//        How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing?
//
//        Three conditions must be met for a valid experiment:
//        Float parameter "h" in meters must be greater than 0
//        Float parameter "bounce" must be greater than 0 and less than 1
//        Float parameter "window" must be less than h.
//        If all three conditions above are fulfilled, return a positive integer, otherwise return -1.
public class Task3 {
    public static void main(String[] args) {
        System.out.println(BouncingBall.bouncingBall(3, 0.66, 1.5));
    }
}
 class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if ((h <= 0) || (window >= h) || (bounce <= 0) || (bounce >= 1))
            return -1;
        double height = h;
        int count = 0;
        while(height > window) {
            count++;
            height*=bounce;
        }
        return count*2-1;
    }
}