package patterns.behavorial.iterator.iterator_edition_one.iterators;

import patterns.behavorial.iterator.iterator_edition_one.MenuItem;

public class DinnerMenuIterator implements Iterator{


	MenuItem [] menuItems;
	int position = 0;
	
	public DinnerMenuIterator(MenuItem[] menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(position !=menuItems.length && menuItems[position] != null ) {
			return true;
		}
		return false;
	}

	@Override
	public MenuItem next() {
		if(hasNext()) {
			MenuItem temp = menuItems[position] ;
			position++;
			return temp;
		}
		return null;
	}

}
