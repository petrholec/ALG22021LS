package bank3Bank;

public class Company extends Client{

    public Company(String name) {
        super(name);
    }

    @Override
    public String addressClient() {
        return "Firma " + super.name;
    }
    
}