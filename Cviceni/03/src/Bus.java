public class Bus {
	//data
	private int capacity; //vlastnost, nebude se měnit
	private double speed = 0;
	private int numberOfStops;
	private String company;
	private int numberOfPassangers = 0; //stav, bude se měnit
	
	//konstruktor 
	public Bus(int capacity, int numberOfStops, String company) {
		this.capacity = capacity;
		this.numberOfStops = numberOfStops;
		this.company = company;
		
	}
	
	//pretizeny konstruktor (overloaded)
	public Bus() {
		
	}
	
	//metody
	//public class interface, public class API
	//překrytí metody
	
	public String toString() {
		return "company " + company + ", pocet zastavek " + numberOfStops + " ,rychlost " + speed + ", kapacita " + 
				capacity + ", pocet kastanu " + numberOfPassangers;
	}
	
	public boolean getIn() {
		if (numberOfPassangers >= capacity){
			return false;
		} 
		
		numberOfPassangers++;
		return true;
	}
	
	public void getOf() {
		if(numberOfPassangers <= 0) {
			return;
		}
		numberOfPassangers--;
	}
	
	public void getOfAll() {
		//numberOfPassangers = 0;
		while (numberOfPassangers != 0) {
			getOf();
		}
	}
	
	
	//setter
	public void setCapacity(int capacity) {
		if (!(capacity >= numberOfPassangers)) {
			throw new IllegalArgumentException("kapacita byl měla být větší nebo rovna než počet cestujících");
		}
		this.capacity = capacity;
		
	}
	
	public void setSpeed() {
		this.speed = speed;
		
	}
	
	
	//getter
	public int getCapacity() {
		return capacity;
	}
	
	public double getSpeed() {
		return speed;
	}
}