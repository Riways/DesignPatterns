package patterns.structural.composite;

public class Leaf extends Component {
	int content = this.hashCode();


	@Override
	public void remove() {
			content = 0;
		
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public int getAmount() {
		
		System.out.println("Leaf: " + content);
		
		return 1;
		
	}
}
