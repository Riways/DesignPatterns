package patterns.creatioanal.factory_method;

public class Helicopter extends Vehicle {

	@Override
	public HelicopterEngine createEngine() {
		return new HelicopterEngine();
	}
	
}
