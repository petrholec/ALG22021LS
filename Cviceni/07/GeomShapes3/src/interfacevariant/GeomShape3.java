package interfacevariant;

import java.util.ArrayList;
import java.util.List;

public class GeomShape3 {

    public static void main(String[] args) throws Exception {
            Rectangle r = new Rectangle(2, 3);
            Circle c1 = Circle.getInstanceD(4);
            Circle c2 = Circle.getInstanceR(3);

        
            System.out.println("3.varianta");

            //program to interface not to implementation
            ArrayList<AreaComputable> shapes3 = new ArrayList();
            shapes3.add(r); //Rectangle implementuje AreaComputable
            shapes3.add(c1);
            shapes3.add(c2);

            double allArea3 = 0;


            for (AreaComputable shape : shapes3) {
                allArea3 += shape.computeArea(); //polymorfismus
            }

            System.out.format("%.2f%n", allArea3);

            AreaComputable a = new Rectangle(2, 3);
            List shapes33 = new ArrayList();

            } 
    }
