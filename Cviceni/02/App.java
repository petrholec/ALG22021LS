import java.awt.Point;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class App {
    public static Scanner sc = new Scanner(System.in);
    
    public double distancebetween(int x1, int x2, int y1, int y2)
	{
	    double dis;
	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	     
        return dis;
	}

    public double calculateDistance(Point b){ //toto je objektove, pouzivat toto
        return Math.hypot(x, y);
    }

    public static double calculateDistanceBetween(Point a, Point b){ // toto je staticke, neni objektove
        return Math.hypot(a.x - b.x, a.y - b.y);
    }


    


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.println(Point.calculateDistanceBetween(a, b)); //pouyiti staticke metody. to nechceme
        System.out.println(a.calculateDistance(b)); // toto je objektove, vsimni si promenne pred teckou
    }

}
