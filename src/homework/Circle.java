package homework;

/**
 * Created by prots on 03.05.2017.
 */
public class Circle {
    public static void main(String[] args) {
        double radius = 4.5;
        System.out.println("Perimeter=" + (2 * Math.PI * radius));
        System.out.println("Area=" + (Math.PI * Math.pow(radius, 2)));
    }
}