public class Fruit {

    private static int nFruit = 0; //staticky atribut
    static final String UNIT = "kg"; //staticky atribut, konstatnta
    private String name; //instancni adtribut

    //konstruktor
    public Fruit(String name){ //jmenuje se stejne jako nazev tridy, inicializace instancnich atribut
        this.name = name;
        nFruit++;
    }  

    //konstruktor pretizeny, overloaded
    public Fruit(){
        this.name = "nezname";
        nFruit++;
    }

    //tovarni metoda
    public static Fruit getInstance(String name){
        return new Fruit(name); //vsimni si ze tu je konstruktor
    }

    //istnancni metoda, nema slovicko static
    public String getName(){
        return this.name;
    }

    //prekryta metoda, prekryje skrytou metodu nebo defaultni metodu, toString je defaultni metoda, takto je prekryta
    // dava se tam pripona @Override, abych to vedel
    @Override
    public String toString(){
        return "ovoce" + name;
    }

    public static void main(String[] args) {
        Fruit f = new Fruit(); //volani prazdneho konstruktoru
        Fruit ff = new Fruit("Apple");
        System.out.println(Fruit.UNIT); //volani statickeho atributu
        //System.out.println(f.nFruit);
       // System.out.println(ff.nFruit);
       System.out.println(Fruit.nFruit);

       Fruit fff = Fruit.getInstance("hruska");//volani staticke metody
       System.out.println(fff.getName()); // volani instancni metody

    }
}
