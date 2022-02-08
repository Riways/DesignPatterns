package patterns.structural.decorator.decorators;

import patterns.structural.decorator.drinks.Drink;

public class Milk extends AbstractDrinkDecorator{
	
	public Milk(Drink drink) {
		this.drink = drink; 
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return drink.cost() + 0.20;
	}

}
