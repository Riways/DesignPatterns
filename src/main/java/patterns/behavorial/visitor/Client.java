package patterns.behavorial.visitor;

import java.util.ArrayList;
import java.util.List;

import patterns.behavorial.visitor.components.Component;
import patterns.behavorial.visitor.components.ComponentImplA;
import patterns.behavorial.visitor.components.ComponentImplB;
import patterns.behavorial.visitor.visitors.Visitor;
import patterns.behavorial.visitor.visitors.VisitorImplA;
import patterns.behavorial.visitor.visitors.VisitorImplB;

public class Client {
	
	public static void clientCode(List<Component> components, Visitor visitor)
    {
        for(Component component : components)
        {
            component.accept(visitor);
        }
    }
	
	public static void main(String[] args) {
		List<Component> components = new ArrayList<Component>();
		
        components.add(new ComponentImplA()); 
        components.add(new ComponentImplB()); 

        
        System.out.println("The client code works with all visitors via the base Visitor interface:");
        Visitor visitor1 = new VisitorImplA();
        Client.clientCode(components,visitor1);

        System.out.println("It allows the same client code to work with different types of visitors:");
        Visitor visitor2 = new VisitorImplB();
        Client.clientCode(components, visitor2);
	}
}
