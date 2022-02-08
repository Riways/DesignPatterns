package patterns.structural.decorator;

import patterns.structural.decorator.decorators.Milk;
import patterns.structural.decorator.decorators.Sugar;
import patterns.structural.decorator.drinks.Drink;
import patterns.structural.decorator.drinks.Espresso;
import patterns.structural.decorator.drinks.HouseBlend;

public class Client {

	public static void main(String[] args) {
		Drink drink = new Espresso();
		
		System.out.println(drink.getDescription() + " $" + drink.cost());
		
		Drink drink2 = new HouseBlend();
		drink2 = new Milk(drink2);
		drink2 = new Milk(drink2);
		drink2 = new Sugar(drink2);
		
		System.out.println(drink2.getDescription() + " $" +  drink2.cost());
	}
}
