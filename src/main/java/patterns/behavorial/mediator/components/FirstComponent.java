package patterns.behavorial.mediator.components;


public class FirstComponent extends BasicComponent{

	public FirstComponent() {
	}
	
	public void doA() {
		System.out.println("FirstComponent does A");
		this.mediator.notifyComponent(this, "A");
	}
	
	public void doB() {
		System.out.println("FirstComponent does B");
		this.mediator.notifyComponent(this, "B");
	}
	

}
