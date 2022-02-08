package patterns.structural.decorator.drinks;

public class Espresso extends Drink {

	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
