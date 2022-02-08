package patterns.behavorial.iterator.iterator_edition_one.iterators;

import patterns.behavorial.iterator.iterator_edition_one.MenuItem;

public interface Iterator {
	public boolean hasNext();
	public MenuItem next();
	default public void a() {};
}
