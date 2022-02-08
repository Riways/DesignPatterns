package patterns.creatioanal.abstract_factory.factories;

import patterns.creatioanal.abstract_factory.engines.CarEngine;
import patterns.creatioanal.abstract_factory.engines.Engine;
import patterns.creatioanal.abstract_factory.wheels.CarWheel;
import patterns.creatioanal.abstract_factory.wheels.Wheel;

public class CarFactory extends VehicleFactory {
	
	{
		System.out.println("CarFactory created");
	}
	
	@Override
	public Engine createEngine() {
		return new CarEngine();
	}

	@Override
	public Wheel createWheel() {
		return new CarWheel();
	}
}
