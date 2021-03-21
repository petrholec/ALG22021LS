import java.util.Arrays;

public class Polynomial {
    // 5x^2 + 4x -1 TOTO JE NAS POLYNOM
    // 5 4 -1 TOTO jsou koeficienty
    // 2 1 0 exponenety
    
    private double[] coefR; // [-1, 4, 5] to tam chcem
    private int stupen = 0;

    //konstruktor
    private Polynomial(double[] coefR){ // [-1, 4, 5]
        this.coefR = Arrays.copyOf(coefR, coefR.length); //defenzivni kopie
        this.stupen = coefR.length;
    }


    /*
    public Polynomial(double[] c, boolean reverted){
        if(reverted){
            this.coefR = Arrays.copyOf(c, c.length);
        } else {
            double[] coefR = new double[c.length];
            for (int i = 0; i < coefR.length; i++){
                coefR[i] = c[c.length -1 -i];
            }
            this.coefR = coefR;
        }
    }
    */

    //tovarni metoda
    public static Polynomial getInstance(double...coef) {
        double[] coefR = new double[coef.length];
        for (int i = 0 ; i< coefR.length ; i++) {
            coefR[i] = coef[coef.length - 1 - i];
        }
        return new Polynomial(coefR);
    }

    public static Polynomial getInstanceRev(double...coefR) {
        return new Polynomial(coefR);
    }


    public static Polynomial getInstanceFromReverted(double...coefR){
        return new Polynomial(coefR);
    }

    // 5x^2 + 4x -1 [-1, 4, 5]
    //10x + 4   [4, 10]
    public Polynomial derivate() {
        double[] derPoleR = new double[this.coefR.length - 1];
        for(int i = 0; i < derPoleR.length; i++) {
            derPoleR[i] = this.coefR[i+1] * (i+1);
        }
        return new Polynomial(derPoleR);
    }


    public double[] getAllCoefR(){
        return Arrays.copyOf(coefR, coefR.length);
    }



    @Override
    public String toString() {
        return "Polynomial [coefR=" + Arrays.toString(coefR) + "]";
    }

    public int getStupenPoly(){
        return stupen - 1;
    }

    public double getCoef(int index){
        double coef = this.coefR[Math.abs(index - this.stupen)];
        return coef;
    }

    public String toFormatedString(){
        // "5x^2 + 4x^1 -1" toto chcem na vystup
        int s = getStupenPoly() + 1;
        String res = "";
        for(int i = 0; i < s; i++){
            res = res + coefR[i] + " x^" + i + " + ";
        }
        return res;
    }

    public double hornerValue(int x) { // to x je cislo ktere chceme cely polynom vynasobit
        double result = coefR[0];
        for (int i = 1; i < this.coefR.length; i++) {
            result = result * x + coefR[i];
        }
        return result;
    }

    

}
