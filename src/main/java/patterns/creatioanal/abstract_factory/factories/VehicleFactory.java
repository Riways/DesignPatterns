package patterns.creatioanal.abstract_factory.factories;

import patterns.creatioanal.abstract_factory.engines.Engine;
import patterns.creatioanal.abstract_factory.wheels.Wheel;

public abstract class VehicleFactory {
	
	public abstract Engine createEngine();
	public abstract Wheel createWheel();

}
