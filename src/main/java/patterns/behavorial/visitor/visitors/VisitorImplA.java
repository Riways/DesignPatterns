package patterns.behavorial.visitor.visitors;

import patterns.behavorial.visitor.components.ComponentImplA;
import patterns.behavorial.visitor.components.ComponentImplB;

public class VisitorImplA implements Visitor{
	public void visitA(ComponentImplA element) {
		System.out.println(element.specialMethodOfComponentA() + "VisitorImplA");
	}

	public void visitB(ComponentImplB element) {
		System.out.println(element.exclusiveMethodOfComponentB()+ "VisitorImplA");
	}
}
