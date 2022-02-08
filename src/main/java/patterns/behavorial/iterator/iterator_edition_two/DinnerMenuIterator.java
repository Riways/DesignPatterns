package patterns.behavorial.iterator.iterator_edition_two;

import java.util.Iterator;


public class DinnerMenuIterator implements Iterator<MenuItem>{

	

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
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException
		 ("You shouldn't be trying to remove menu items.");

	}
	

}
