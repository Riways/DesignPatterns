package patterns.creatioanal.builder;

import patterns.creatioanal.builder.builders.CarBuilder;
import patterns.creatioanal.builder.director.Director;
import patterns.creatioanal.builder.product_cars.Car;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		CarBuilder  builder = new CarBuilder();
		director.counstructFamilyCar(builder);
		
		Car car = builder.getResult();
		
		
		System.out.println( car.toString());
		
	}
}
