package visitor;

public class ConcreteVistor implements Visitor {
	
	public void visit (ConcreteElement concreteElement) {
		System.out.println ("Visiting " + concreteElement.getClass().getName());
	}

}