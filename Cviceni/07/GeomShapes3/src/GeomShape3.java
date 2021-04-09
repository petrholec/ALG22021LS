import java.util.ArrayList;

public class GeomShape3 {

    public static void main(String[] args) throws Exception {
            Rectangle r = new Rectangle(2, 3);
            Circle c1 = Circle.getInstanceD(4);
            Circle c2 = Circle.getInstanceR(3);

            System.out.println("1.varianta");
            double allArea = r.calculateArea() + c1.getArea() + c2.getArea();
            System.out.format("%.2f%n", allArea);


            System.out.println("2.varianta"); //kazda trida je zaroven typu object, vyuziti automaticke vazby dedicnosti od object
            ArrayList<Object> shapes2 = new ArrayList(); //muze obsahovat object a potomky object a vsechno typove kompatibilni s object
            shapes2.add(r); //Rectangle je potomek (IS A) Object
            shapes2.add(c1);
            shapes2.add(c2);

            /*
            for (int i = 0; i < shapes2.length; i++) { //fori. Netreba prochazeni celeho pole nebo vynehchani cyklu, potrebuju indexy, lze mazat nebo upravovat pole za pruchodu
                shapes2.get(i);
            }
            */

            double allArea2 = 0;
            for (Object object : shapes2) { //foreach. Prochazeni celeho pole, netreba znat indexy, nelze mazat nebo upravovat za pruchodu
                if(object instanceof Rectangle){
                    allArea2 += ((Rectangle)object).calculateArea(); //Pretypovani z objektu na rectangle. Po pretypovani je mozno pouzit metody Rectangle
                } else if (object instanceof Circle){
                    allArea2 += ((Circle)object).getArea();
                }
            }
            System.out.format("%.2f%n", allArea2);


            System.out.println("3.varianta");
            /*
            Shape s = new Rectangle(2, 3);// jde
            Object o = new Shape();// jde
            Object oo = new Rectangle(2, 3); //neprimy potomek, ale cesta tam je. Shape zdedil vsechno, tak to zdedil i Rectangle, jde.
            Rectangle rr = new Shape(); //toto uz nejde
            Rectangle rrr = new Circle(); // take ne
            */
            ArrayList<Shape> shapes3 = new ArrayList();
            shapes3.add(r); //rectangle IS A Shape Shape s = new Rectangle(2, 3)
            shapes3.add(c1);
            shapes3.add(c2);
            shapes3.add(new Triangle());

            double allArea3 = 0;
            for (Shape shape : shapes3) {
                allArea3 += shape.computeArea(); //polymorfismus
            }

            System.out.format("%.2f%n", allArea3);

            } 
    }
