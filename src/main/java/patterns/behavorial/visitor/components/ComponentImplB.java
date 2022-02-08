package patterns.behavorial.visitor.components;

import patterns.behavorial.visitor.visitors.Visitor;

public class ComponentImplB implements Component {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitB(this);
	}

	public String exclusiveMethodOfComponentB()
    {
        return "B";
    }
}