package patterns.creatioanal.builder.builders;

import patterns.creatioanal.builder.components.Engine;
import patterns.creatioanal.builder.components.Transmission;
import patterns.creatioanal.builder.components.Wheels;
import patterns.creatioanal.builder.product_cars.Car;
import patterns.creatioanal.builder.product_cars.CarType;

public class CarBuilder extends Builder {
	
	private CarType carType;
	private Transmission transmission;
	private Engine engine;
	private Wheels wheels;
	private int maxSpeed;
	private double acceleration;

	@Override
	public void setCarType(CarType type) {
		carType = type;
		
	}

	@Override
	public void setAcceleration(double acc) {
		acceleration = acc;		
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
		
	}

	@Override
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		
	}

	@Override
	public void setTransmission(Transmission tansmission) {
		this.transmission = tansmission;
		
	}

	@Override
	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
		
	}
	
	
	public Car getResult() {
		return new Car(carType, transmission, engine, wheels, maxSpeed, acceleration);
	}
}
