package patterns.structural.adapter.adapter_of_interfaces_is_better;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationToIteratorAdapter implements Iterator<Object> {

	Enumeration<Object> someEnumeration;
	
	
	public EnumerationToIteratorAdapter(Enumeration<Object> someEnumeration) {
		super();
		this.someEnumeration = someEnumeration;
	}

	@Override
	public boolean hasNext() {
		return someEnumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return someEnumeration.nextElement();
	}

}
