package patterns.structural.decorator.drinks;

public class HouseBlend extends Drink {

	public HouseBlend() {
		description = "House Blend";
	}

	public double cost() {
		return .89;
	}
}
