package patterns.behavorial.state;

public class Client {
	public static void main(String[] args) {
		GumballMachine gM = new GumballMachine(100);
		
		gM.insertQuarter();
		gM.ejectQuarter();
	}
}
