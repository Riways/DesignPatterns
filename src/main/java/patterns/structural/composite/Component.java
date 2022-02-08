package patterns.structural.composite;

public abstract class Component {
	public abstract int getAmount();
	public abstract void remove();
	public abstract boolean isComposite();
}
