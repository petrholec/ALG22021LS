public class PolynomialTools {

    public static Polynom twoPolynoms(Polynom coef1, Polynom coef2) {
        
    if(coef1.getLevel()>coef2.getLevel()){
        double[] pol=coef1.getCoefRev();
        for(int i=0;i<pol.length;i++){
        pol[i]=pol[i]+coef2.getCoefAt(i);
        return new Polynom(pol, true);
        }
    }
        double[] pol=coef2.getCoefRev();
        for(int i=0;i<pol.length;i++){
        pol[i]=pol[i]+coef1.getCoefAt(i);   
        }
    return new Pol;
}
