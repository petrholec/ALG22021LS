public class BusApp {
    public static void main(String[] args) throws Exception {
        //Bus universityBus = new Bus();
		//universityBus.capacity = 42;
		
		Bus homeBus = new Bus();
		Bus universityBus = new Bus(42, 5, "RegioJet");
		System.out.println(universityBus.toString());
		System.out.println(homeBus.toString());
		
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		System.out.println(universityBus.getCapacity());
		universityBus.setCapacity(100);
		System.out.println(universityBus.getCapacity());
		
		System.out.println("");
		
		System.out.println("pokus o nastup");
		System.out.println(universityBus.getIn());
		universityBus.getIn();
		System.out.println(universityBus.toString());
		
		System.out.println("");
		
		System.out.println("výstup jednoho člověka");
		universityBus.getOf();
		System.out.println(universityBus.toString());
		
		System.out.println("");
		
		System.out.println("výstup všech");
		universityBus.getOfAll();
		System.out.println(universityBus.toString());
		
		System.out.println("");
		
		System.out.println("výstup jednoho");
		universityBus.getOf();
		System.out.println(universityBus.toString());
		
		
		
		
    }
}