
package patterns.behavorial.observer;

import java.util.concurrent.ThreadLocalRandom;

import patterns.behavorial.observer.observers.ConsoleObserverImpl;
import patterns.behavorial.observer.observers.Observer;
import patterns.behavorial.observer.subject.WheatherDataImplementsSubject;

public class Client {
	
	public static void main(String[] args) {
		
		WheatherDataImplementsSubject sbj = new WheatherDataImplementsSubject();
		
		Observer obs1 = new ConsoleObserverImpl(sbj);
		
		sbj.registerObserver(obs1);
		
		sbj.setMeasurements(ThreadLocalRandom.current().nextDouble(-50.0, 40.0), ThreadLocalRandom.current().nextDouble(0.1, 99.0));
		sbj.setMeasurements(ThreadLocalRandom.current().nextDouble(-50.0, 40.0), ThreadLocalRandom.current().nextDouble(0.1, 99.0));
		sbj.setMeasurements(ThreadLocalRandom.current().nextDouble(-50.0, 40.0), ThreadLocalRandom.current().nextDouble(0.1, 99.0));
		sbj.setMeasurements(ThreadLocalRandom.current().nextDouble(-50.0, 40.0), ThreadLocalRandom.current().nextDouble(0.1, 99.0));
	}

}
