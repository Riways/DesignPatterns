package patterns.behavorial.mediator.components;


public class SecondComponent extends BasicComponent{

	public SecondComponent() {
	}

	
	public void doC() {
		System.out.println("SecondComponent does C");
		this.mediator.notifyComponent(this, "C");
	}
	
	public void doD() {
		System.out.println("SecondComponent does D");
		this.mediator.notifyComponent(this, "D");
	}
	

}
