package patterns.behavorial.visitor.visitors;

import patterns.behavorial.visitor.components.ComponentImplA;
import patterns.behavorial.visitor.components.ComponentImplB;

public interface Visitor {
	void visitA(ComponentImplA element);
	void visitB(ComponentImplB element);
}
