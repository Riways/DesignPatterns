package patterns.behavorial.iterator.iterator_edition_one;

import patterns.behavorial.iterator.iterator_edition_one.iterators.Iterator;
import patterns.behavorial.iterator.iterator_edition_one.menu.BreakfastMenu;
import patterns.behavorial.iterator.iterator_edition_one.menu.DinnerMenu;

public class Client {

	public static void main(String[] args) {
		
		
		BreakfastMenu bM = new BreakfastMenu();
		Iterator breakfastIterator = bM.getIterator();
		while(breakfastIterator.hasNext()) {
			System.out.println(breakfastIterator.next().getName()); 
		}
		
		DinnerMenu dM = new DinnerMenu();
		Iterator dinnerIterator = dM.getIterator();
		while(dinnerIterator.hasNext()) {
			System.out.println(dinnerIterator.next().getName()); 
		}
		
	}
}
