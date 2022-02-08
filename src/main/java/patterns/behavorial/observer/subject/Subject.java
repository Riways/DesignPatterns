package patterns.behavorial.observer.subject;

import patterns.behavorial.observer.observers.Observer;

public interface Subject {

	public abstract void registerObserver(Observer o);
	public abstract void removeObserver(Observer o);
	public abstract void notifyObservers();
}
