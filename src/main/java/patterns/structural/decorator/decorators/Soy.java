package patterns.structural.decorator.decorators;

import patterns.structural.decorator.drinks.Drink;

public class Soy extends AbstractDrinkDecorator{
	
	public Soy(Drink drink) {
		this.drink = drink; 
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return drink.cost() + 0.25;
	}

}
