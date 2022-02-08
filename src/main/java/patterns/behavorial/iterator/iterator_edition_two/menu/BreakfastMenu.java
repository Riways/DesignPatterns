package patterns.behavorial.iterator.iterator_edition_two.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import patterns.behavorial.iterator.iterator_edition_two.MenuItem;


public class BreakfastMenu {
	
	List<MenuItem> menuItems;

	public BreakfastMenu() {
		 menuItems = new ArrayList<MenuItem>();
		 menuItems.add(new MenuItem("A",  false, 1));
		 menuItems.add(new MenuItem("B",  false, 2));
		 menuItems.add(new MenuItem("C",  true, 3));
	}
	

	public ArrayList<MenuItem> getItems(){
		return (ArrayList<MenuItem>) menuItems;
	}
	

	public Iterator<MenuItem> getIterator() {
		return menuItems.iterator();
	}

}
