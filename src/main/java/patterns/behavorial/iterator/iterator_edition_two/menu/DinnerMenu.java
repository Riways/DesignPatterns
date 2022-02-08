package patterns.behavorial.iterator.iterator_edition_two.menu;


import java.util.Iterator;

import patterns.behavorial.iterator.iterator_edition_two.MenuItem;
import patterns.behavorial.iterator.iterator_edition_two.DinnerMenuIterator;

public class DinnerMenu {
	MenuItem [] menuItems;

	public DinnerMenu() {
		 menuItems = new MenuItem[3];
		 menuItems[0]=(new MenuItem("D",  false, 1));
		 menuItems[1]=(new MenuItem("E",  false, 2));
		 menuItems[2]=(new MenuItem("F",  true, 3));
	}
	

	public MenuItem[] getItems(){
		return  menuItems;
	}
	
	public Iterator<MenuItem> getIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}
