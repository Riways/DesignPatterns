package patterns.creatioanal.factory_method;

public class Car extends Vehicle {
	
	@Override
	public Engine createEngine() {
		return new CarEngine();
	}
}
