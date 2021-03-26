import java.util.ArrayList;
import java.util.Scanner;

public class NShapeApp {
    private static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {
        NShape shape = new NShape();
        System.out.println("zadej pocet bodu");
        int n = sc.nextInt();
        System.out.println("zadej souradnice ");
        double x, y;
        Point p;
        for (int i=0; i < n; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            shape.add(x, y);
        }
        double perim = shape.calculatePerim();
        System.out.format("obvod je %.2f%n", perim);
    }

}
