package patterns.creatioanal.builder.builders;
import patterns.creatioanal.builder.components.Engine;
import patterns.creatioanal.builder.components.Transmission;
import patterns.creatioanal.builder.components.Wheels;
import patterns.creatioanal.builder.product_cars.CarType;

public abstract class Builder {
	
	public abstract void setCarType(CarType type);
	public abstract void setAcceleration(double acc);
	public abstract void setEngine(Engine engine);
	public abstract void setMaxSpeed(int maxSpeed);
	public abstract void setTransmission(Transmission tansmission);
	public abstract void setWheels(Wheels wheels);
	
}
