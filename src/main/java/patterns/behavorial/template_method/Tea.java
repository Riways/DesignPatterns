package patterns.behavorial.template_method;

public class Tea extends CoffeinDrinks {

	@Override
	public void makeDrink() {
		System.out.println("Put tea bag in water...");
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
		System.out.println('\n' +"Tea is brewed");
	}

	@Override
	public void addCondiments() {
		System.out.println("Lemon and sugar added");

	}

}
