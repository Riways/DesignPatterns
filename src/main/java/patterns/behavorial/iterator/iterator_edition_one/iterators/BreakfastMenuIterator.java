package patterns.behavorial.iterator.iterator_edition_one.iterators;

import java.util.ArrayList;

import patterns.behavorial.iterator.iterator_edition_one.MenuItem;

public class BreakfastMenuIterator implements Iterator {

	ArrayList<MenuItem> menuItems;
	int position;
	
	
	public BreakfastMenuIterator(ArrayList<MenuItem> menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(position < menuItems.size() && menuItems.get(position) != null) {
			return true;
		}
		return false;
	}

	@Override
	public MenuItem next() {
		if(hasNext()) {
			MenuItem temp = menuItems.get(position);
			position++;
			return temp;
		}
		return null;
	}

}
