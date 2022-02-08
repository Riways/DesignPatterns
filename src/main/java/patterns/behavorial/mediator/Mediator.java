package patterns.behavorial.mediator;

import patterns.behavorial.mediator.components.BasicComponent;

public interface Mediator {
	public void notifyComponent( BasicComponent bC, String message);
}
