import java.util.Scanner;

public class NShapeAppStaticArray {
    private static Scanner sc = new Scanner(System.in);
    private static Point[] nShape; //globalni promenna, je viditelny pro vsechny staticke metody

    public static void main(String[] args) {
        System.out.println("zadej pocet bodu");
        int n = sc.nextInt();
        nShape = new Point[n];
        System.out.println("zadej souradnice ");
        double x, y;
        Point p;
        for (int i=0; i < nShape.length; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            p = new Point(x, y);
            nShape[i] = p;            
        }
        double perim = calculatePerim();
        System.out.format("obvod je %.2f%n", perim);
    }

    public static double calculatePerim(){
        double perim = 0;
        for (int i = 0; i < nShape.length - 1; i++) {
            perim = perim  + nShape[i].calculateDistaceFrom(nShape[i + 1]);
        }
        perim = perim + nShape[nShape.length - 1].calculateDistaceFrom(nShape[0]);
        return perim;
    }
}
