package patterns.behavorial.mediator.components;

import patterns.behavorial.mediator.Mediator;

public abstract class BasicComponent {
	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

}
