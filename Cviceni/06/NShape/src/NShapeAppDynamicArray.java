import java.util.ArrayList;
import java.util.Scanner;

public class NShapeAppDynamicArray {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Point> nShape; //globalni promenna, je viditelny pro vsechny staticke metody

    public static void main(String[] args) {
        nShape = new ArrayList<>();
        System.out.println("zadej pocet bodu");
        int n = sc.nextInt();
        System.out.println("zadej souradnice ");
        double x, y;
        Point p;
        for (int i=0; i < nShape.size(); i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            p = new Point(x, y);
            nShape.add(p);
        }
        double perim = calculatePerim();
        System.out.format("obvod je %.2f%n", perim);
    }

    public static double calculatePerim(){
        double perim = 0;
        for (int i = 0; i < nShape.size() - 1; i++) {
            perim = perim  + nShape.get(i).calculateDistaceFrom(nShape.get(i + 1));
        }
        perim = perim + nShape.get(nShape.size() - 1).calculateDistaceFrom(nShape.get(0));
        return perim;
    }
}
