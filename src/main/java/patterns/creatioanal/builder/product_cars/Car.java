package patterns.creatioanal.builder.product_cars;

import patterns.creatioanal.builder.components.Engine;
import patterns.creatioanal.builder.components.Transmission;
import patterns.creatioanal.builder.components.Wheels;

public class Car {
	
	private CarType carType;
	private Transmission transmission;
	private Engine engine;
	private Wheels wheels;
	private int maxSpeed;
	private double acceleration;
	private int carId;
	
	public Car(CarType carType, Transmission transmission, Engine engine, Wheels wheels, int maxSpeed,
			double acceleration) {
		this.carType = carType;
		this.transmission = transmission;
		this.engine = engine;
		this.wheels = wheels;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
	}

	public CarType getCarType() {
		return carType;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public Engine getEngine() {
		return engine;
	}

	public Wheels getWheels() {
		return wheels;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	@Override
	public String toString() {
		return "Car [carType=" + carType + ", transmission=" + transmission + ", engine=" + engine + ", wheels="
				+ wheels + ", maxSpeed=" + maxSpeed + ", acceleration=" + acceleration + "]";
	}
	
	
	
}
