package patterns.behavorial.template_method;

public abstract class CoffeinDrinks {
	
	public void prepareRecipe() {
		boilWater();
		makeDrink();
		addCondiments();
		pourInCup();
	}
	
	public void boilWater() {
		System.out.println("Water is boiled...");
	}
	
	public abstract void makeDrink();
	
	public abstract void addCondiments();
	
	public void pourInCup() {
		System.out.println("Pouring drink into cup");
	}

	
}
