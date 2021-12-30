package visitor;

public class ConcreteElement extends Element {
	
	public void accept (Visitor visitor) {
		visitor.visit(this);
		super.accept(visitor);
	}

}