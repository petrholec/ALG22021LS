
public class Polynomial3 {
    public static void main(String[] args) throws Exception {
        double[] p = {-1,4,5};
        //Polynomial pp = new Polynomial(p);
        //System.out.println(pp);
        //p[0] = 1;
        //System.out.println(pp);

        //Polynomial pp = Polynomial.getInstance(p);
        //System.out.println(pp);
        //Polynomial pp1 = Polynomial.getInstanceFromReverted(p);
        //System.out.println(pp1);
        //pp.derivate();
        //System.out.println(pp);


        Polynomial pp = Polynomial.getInstance(5,4,-1);
        System.out.println(pp);
        Polynomial tt = pp.derivate();
        System.out.println(tt);
        int sp = pp.getStupenPoly();
        System.out.println("stupen polynomu je: " + sp); 
        System.out.println(pp.toFormatedString()); 
        System.out.println(pp.hornerValue(2));

        


        }
}
