package patterns.structural.composite;

public class Client {

	public static void main(String[] args) {
		Leaf l1 = new Leaf();
		Leaf l2 = new Leaf();
		Leaf l3 = new Leaf();
		Leaf l4 = new Leaf();
		Leaf l5 = new Leaf();
		Leaf l6 = new Leaf();
		Leaf l7 = new Leaf();
		
		Composite c1 = new Composite();
		Composite c2 = new Composite();
		Composite c3 = new Composite();
		Composite c4 = new Composite();
		
		
		c1.add(c2);
		c1.add(c3);
		c2.add(c4);
		c1.add(l1);
		c2.add(l2);
		c2.add(l3);
		c3.add(l4);
		c3.add(l5);
		c3.add(l6);
		c4.add(l7);
		
		
		c1.getAmount();
	}
}
