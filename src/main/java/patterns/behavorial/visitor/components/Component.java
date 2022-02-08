package patterns.behavorial.visitor.components;

import patterns.behavorial.visitor.visitors.Visitor;

public interface Component {
	void accept(Visitor visitor);
}
