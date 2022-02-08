package patterns.behavorial.mediator;

import patterns.behavorial.mediator.components.FirstComponent;
import patterns.behavorial.mediator.components.SecondComponent;

public class Client {
	public static void main(String[] args) {

		FirstComponent component1 = new FirstComponent();
		SecondComponent component2 = new SecondComponent();

		@SuppressWarnings("unused")
		Mediator med = new MediatorImpl(component1, component2);
		System.out.println("Client triggers operation A.");
		component1.doA();
		
		System.out.println();


		System.out.println("Client triggers operation D.");
		component2.doD();
	}
}
