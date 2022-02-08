package patterns.creatioanal.abstract_factory;

import patterns.creatioanal.abstract_factory.engines.Engine;
import patterns.creatioanal.abstract_factory.factories.VehicleFactory;
import patterns.creatioanal.abstract_factory.wheels.Wheel;

public class Client {
	@SuppressWarnings("unused")
	private Wheel wheel;
	@SuppressWarnings("unused")
	private Engine engine;
	
	public Client (VehicleFactory vehicle) {
		this.engine = vehicle.createEngine();
		this.wheel = vehicle.createWheel();
	}

}
