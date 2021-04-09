package interfacevariant;

public class Circle implements AreaComputable { //splnuju pozadavky AreaComputable, jsem typove kompatibilni s AreaComputable
    //data
    double r;

    //konstruktory
    private Circle(double r){ //specialni metoda co vytvari objekt, kdzy je prazdny tak je defaultni, dame ji jako private aby se pouzivali jen tovarni metody
        this.r = r;
    } 

//    public Circle(double d){ //pretizeni je mozne pouze kdyz je jiny pocet nebo typ vstupniho parametru, nejde pretizit
//        
//    }

    //tovarni metoda, vevnitr musi volat konstruktor
    public static Circle getInstanceR(double r){
        return new Circle(r);
    }

    public static Circle getInstanceD(double d){ //prumer
        return new Circle(d/2);
    }

    //getter
    public double getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Circle [r=" + r + "]";
    }

    public double getArea(){
        return Math.PI * r * r;

    }

    @Override
    public double computeArea(){
        return getArea();
    }

    public static void main(String[] args) {
        Circle c = Circle.getInstanceR(2);
        System.out.println(c.getArea());
        System.out.println(c);
    }

    
}
