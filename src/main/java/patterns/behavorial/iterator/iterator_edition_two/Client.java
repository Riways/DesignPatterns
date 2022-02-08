package patterns.behavorial.iterator.iterator_edition_two;

import java.util.Iterator;

import patterns.behavorial.iterator.iterator_edition_two.menu.BreakfastMenu;
import patterns.behavorial.iterator.iterator_edition_two.menu.DinnerMenu;

public class Client {

	public static void main(String[] args) {
		
		
		BreakfastMenu bM = new BreakfastMenu();
		Iterator<MenuItem> breakfastIterator = bM.getIterator();
		while(breakfastIterator.hasNext()) {
			System.out.println(breakfastIterator.next().getName()); 
		}
		
		
		
		DinnerMenu dM = new DinnerMenu();
		Iterator<MenuItem> dinnerIterator = dM.getIterator();
		while(dinnerIterator.hasNext()) {
			System.out.println(dinnerIterator.next().getName()); 
		}
	}
}
