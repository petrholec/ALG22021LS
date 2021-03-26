import java.util.ArrayList;

public class NShape {
    private ArrayList<Point>nShape;

    public NShape(){
        nShape = new ArrayList<>();
    }

    public void add(double x, double y){
        Point p = new Point(x, y);
        nShape.add(p);
    }

    public double calculatePerim(){
        double perim = 0;
        for (int i = 0; i < nShape.size() - 1; i++) {
            perim = perim  + nShape.get(i).calculateDistaceFrom(nShape.get(i + 1));
        }
        perim = perim + nShape.get(nShape.size() - 1).calculateDistaceFrom(nShape.get(0));
        return perim;
    }
}

