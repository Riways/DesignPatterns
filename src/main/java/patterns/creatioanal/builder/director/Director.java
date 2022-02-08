package patterns.creatioanal.builder.director;

import patterns.creatioanal.builder.builders.Builder;
import patterns.creatioanal.builder.components.Engine;
import patterns.creatioanal.builder.components.Transmission;
import patterns.creatioanal.builder.components.Wheels;
import patterns.creatioanal.builder.product_cars.CarType;

public class Director {
	
	public void counstructSprotsCar(Builder builder) {
		builder.setCarType(CarType.RACING);
		builder.setAcceleration(3.0);
		builder.setEngine(new Engine(3.5, 6));
		builder.setMaxSpeed(400);
		builder.setTransmission(Transmission.MANUAL);
		builder.setWheels(new Wheels(20));
	}
	
	public void counstructFamilyCar(Builder builder) {
		builder.setCarType(CarType.FAMILY);
		builder.setAcceleration(9.8);
		builder.setEngine(new Engine(1.5, 3));
		builder.setMaxSpeed(160);
		builder.setTransmission(Transmission.AUTO);
		builder.setWheels(new Wheels(15));
	}
	
	public void counstructTruck(Builder builder) {
		builder.setCarType(CarType.TRUCK);
		builder.setAcceleration(15.1);
		builder.setEngine(new Engine(6, 12));
		builder.setMaxSpeed(120);
		builder.setTransmission(Transmission.AUTO);
		builder.setWheels(new Wheels(30));
	}
	
}
