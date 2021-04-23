package bank3Bank;

public class Person extends Client{

    public Person(String name) { //konstruktory se nededi, musi se takto zavolat
        super(name);
    }

    @Override
    public String adressClient() {
        String name = super.name; //pristup k predkovi pomoci SUPER
        //String ending = name.substring(name.length() - 3);
        //boolean ending = name.matches(".*ova"); 
        boolean isFemale = name.endsWith("ova");
        String greeting = (isFemale)?"Pani":"Pan"; //ternarni operator
        return String.format("%s %s", greeting, name);
    }

public static void main(String[] args) {
        //String s = "Svecova";
        //System.out.println(s.matches(".*ova"));

        
    }
    
}
