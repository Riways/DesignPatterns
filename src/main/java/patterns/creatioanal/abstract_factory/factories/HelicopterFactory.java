package patterns.creatioanal.abstract_factory.factories;

import patterns.creatioanal.abstract_factory.engines.HelicopterEngine;
import patterns.creatioanal.abstract_factory.wheels.HelicopterWheel;

public class HelicopterFactory extends VehicleFactory {
	{
		System.out.println("HelicopterFactory created");
	}

	@Override
	public HelicopterEngine createEngine() {
		return new HelicopterEngine();
	}

	@Override
	public HelicopterWheel createWheel() {
		return new HelicopterWheel();
	}
	
}
