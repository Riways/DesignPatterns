package patterns.behavorial.visitor.components;

import patterns.behavorial.visitor.visitors.Visitor;

public class ComponentImplA implements Component {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitA(this);
	}

	public String specialMethodOfComponentA()
    {
        return "A";
    }
}
