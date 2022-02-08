package patterns.structural.decorator.decorators;

import patterns.structural.decorator.drinks.Drink;

public abstract class AbstractDrinkDecorator extends Drink {

	Drink drink;
	
	public abstract String getDescription();
	
	@Override
	public abstract double cost();

}
