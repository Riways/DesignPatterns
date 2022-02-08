package patterns.behavorial.observer.observers;

import patterns.behavorial.observer.subject.Subject;

public class ConsoleObserverImpl  implements Observer{

	private double temperature;
	private double pressure;
	@SuppressWarnings("unused")
	private Subject weatherData;//for future
	
	
	
	public ConsoleObserverImpl(Subject weatherData) {
		super();
		this.weatherData = weatherData;
	}

	@Override
	public void update(double temp, double pressure) {
		temperature  = temp;
		this.pressure = pressure;
		display();
		
	}

	@Override
	public void display() {
		System.out.println("Current temperature: " + temperature + " \u00B0C, current pressure: " + pressure + " kPa");		
	}
	

}
