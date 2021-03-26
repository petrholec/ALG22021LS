public class Point {
    //data, které si potřebujeme pamatovat pro každý objekt typu Point
    //instanční proměnné, členské proměnné, fields
    private double x;
    private double y;
    
    private double distance; //vypočítáva se jednou
    
    //konstruktory
    //prázdný konstruktor
    public Point(){
        this.x = 0.0;
        this.y = 0.0;
        //distance = calculateDistance();
        distance = 0.0;
    }
    
    //přetížený konstruktor, overloaded
    public Point(double x, double y){
        this.x = x;
        this.y = y;
        distance = calculateDistance();
    }
    
    //metody
    public double getDistance(){
       return distance;
    }
    
    //privátní interní metoda
    private double calculateDistance(){
        //return Math.sqrt(x*x + y*y);
        return Math.hypot(x, y);
    }
    
    //veřejné metody tvoří rozhraní třídy, měli by mít javadoc
    /**
     * Calculate distance from this point to the given point
     * @param p given point
     * @return distance 
     */
    public double calculateDistaceFrom(Point p){
        return Math.hypot(this.x - p.x, this.y - p.y);
    }
    
    //metoda, která nepracuje s datami this, může být i v jiné tříďě
    public static double calculateDistaceBetween(Point a, Point b){
        return Math.hypot(a.x - b.x, a.y - b.y);
    }
    
    /*
    public String getTextRepresentation(){
        return "x=" + x + ", y=" + y;
    }
    */
    
    //překrytí kódu metody zděděné z předka Object 
    @Override
    public String toString(){
        return String.format("[%.2f, %.2f]",x , y);
    }
    
    //getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
    
    /*
    //setter
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    */
