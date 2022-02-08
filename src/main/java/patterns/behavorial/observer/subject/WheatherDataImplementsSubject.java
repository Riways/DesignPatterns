package patterns.behavorial.observer.subject;

import java.util.ArrayList;

import patterns.behavorial.observer.observers.Observer;

public class WheatherDataImplementsSubject implements Subject {

	private ArrayList<Observer> observers;
	private double temperature;
	private double pressure;
	
	
	
	public WheatherDataImplementsSubject() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		System.out.println("Observer registred");
	}

	@Override
	public void removeObserver(Observer o) {
		if(observers.remove(o)) {
			System.out.println("Observer removed");
		}else {
			System.out.println("Observer not found");
		}
		
	}

	@Override
	public void notifyObservers() {
		for(Observer obs: observers) {
			obs.update(temperature, pressure);
		}
	}
	
	public void measuresChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(double temp, double press) {
		temperature = temp;
		pressure = press;
		measuresChanged();
		
	}

}
