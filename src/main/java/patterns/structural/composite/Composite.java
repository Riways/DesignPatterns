package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	List<Component> content;

	public void add(Component comp) {
		if(content == null) {
			content = new ArrayList<Component>();
		}
		content.add(comp);
	}
	
	@Override
	public int getAmount() {
		if(content == null) {
			return 1;
		}
		int counter = 1;
		for(Component co: content) {
			counter += co.getAmount();
		}
		System.out.println("Composite: " + this.hashCode() + " amount: " + counter);
		return counter;
		
	}

	@Override
	public void remove() {
		content = null;
		
	}

	@Override
	public boolean isComposite() {
		return true;
	}

}
