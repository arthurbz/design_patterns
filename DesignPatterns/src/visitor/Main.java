package visitor;

public class Main {

	public static void main(String[] args) {
		ConcreteElement concreteElement = new ConcreteElement();
		ConcreteVistor concreteVisitor = new ConcreteVistor();
		concreteElement.accept(concreteVisitor);
	}

}