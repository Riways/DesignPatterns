package patterns.behavorial.template_method;

public class Coffee extends CoffeinDrinks {

	@Override
	public void makeDrink() {
		System.out.println("Put coffee grains in water...");
		try {
			System.out.print("Wait");
			synchronized (this) {
				for (int i = 0; i < 3; i++) {
					wait(1000);
					System.out.print(".");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println('\n' + "Coffee is brewed");
	}

	@Override
	public void addCondiments() {
		System.out.println("Sugar added");
		
	}

}
