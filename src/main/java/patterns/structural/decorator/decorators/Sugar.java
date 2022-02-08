package patterns.structural.decorator.decorators;

import patterns.structural.decorator.drinks.Drink;

public class Sugar extends AbstractDrinkDecorator {

	public Sugar(Drink drink) {
		this.drink = drink; 
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + ", Sugar";
	}

	@Override
	public double cost() {
		return drink.cost() + 0.10;
	}

}
