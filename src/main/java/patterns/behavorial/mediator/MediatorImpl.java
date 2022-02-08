package patterns.behavorial.mediator;

import patterns.behavorial.mediator.components.BasicComponent;
import patterns.behavorial.mediator.components.FirstComponent;
import patterns.behavorial.mediator.components.SecondComponent;

public class MediatorImpl implements Mediator {

	private FirstComponent comp1;
	private SecondComponent comp2;

	public MediatorImpl(FirstComponent comp1, SecondComponent comp2) {
		this.comp1 = comp1;
		this.comp1.setMediator(this);
		this.comp2 = comp2;
		this.comp2.setMediator(this);
	}

	@Override
	public void notifyComponent(BasicComponent bC, String message) {
		if (message == "A") {
			System.out.println("Mediator reacts on A and triggers folowing operations:");
			comp2.doC();
		}
		if (message == "D") {
			System.out.println("Mediator reacts on D and triggers following operations:");
			comp1.doB();
			comp2.doC();
		}
	}

}
