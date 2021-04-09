public class Rectangle extends Shape{ //dedi od shape
    //data
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Rectangle [a=" + a + ", b=" + b + "]";
    }

    public double calculateArea(){
        return a * b;
    }

    @Override
    public double computeArea(){
        return calculateArea();
    }
    

    
}
