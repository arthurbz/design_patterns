package designpatternmain;

public class DesignPatternConcept {

public static final String AbstractFactory = "Abstract Factory Design Pattern\n\n"
		+ "Abstract Factory provides interfaces for creating families of related\n"
		+ "or dependent objects without specifying their concrete classes\n"
		+ "Example: Suppose we want to build a car factory, but we have OffRoad and Street cars\n"
		+ "So we create a factory for each vehicle type, X car OffRoad type, Y car Street type etc.\n";

public static final String Bridge = "Bridge Design Pattern\n\n"
		+ "It is a structural design pattern allows you to separate the abstraction from the implementation\n"
		+ "There are 2 parts in Bridge design pattern, Abstraction and Implementation\n"
		+ "The bridge pattern allows the Abstraction and the Implementation to be developed independently\n"
		+ "and the client code can access only the Abstraction part without being concerned about the Implementation part\n"
		+ "In our example we have a Bus and a Truck (Abstraction) and they both have and Implementation\n"
		+ "In this case they don't need to be concerned if their Implementation is a cargo or transport vehicle\n";

public static final String Builder = "Builder Design Pattern\n\n"
		+ "Builder pattern aims to “Separate the construction of a complex object from its representation\n"
		+ "so that the same construction process can create different representations.”\n"
		+ "In our example we are building a car that has a lot of parts\n"
		+ "The Builder is responsible of defining all the steps to assemble the product\n"
		+ "We also have each Concrete Builder as a car component\n"
		+ "And the Director is in controll of generating the final product object\n";

public static final String ChainOfResponsibility = "Chain of Responsibility Design Pattern\n\n"
		+ "Chain of responsibility pattern is used to achieve loose coupling in software design\n"
		+ "where a request from the client is passed to a chain of objects to process them.\n"
		+ "Later, the object in the chain will decide themselves who will be processing the request\n"
		+ "and whether the request is required to be sent to the next object in the chain or not.\n"
		+ "In our example we have handlers to check errors\n"
		+ "We also have Concrete handlers, and the Client, who is the originator of the request\n";

public static final String Composite = "Composite Design Pattern\n\n"
		+ "Composite pattern is a partitioning design pattern and describes a group of objects\n"
		+ "that is treated the same way as a single instance of the same type of object.\n"
		+ "The intent of a composite is to “compose” objects into tree structures to represent part-whole hierarchies.\n"
		+ "It allows you to have a tree structure and ask each node in the tree structure to perform a task.\n"
		+ "In our example the Item class is the component, which declares the interface for objects in the composition\n"
		+ "The Box will be the composite, responsible for storing child components\n"
		+ "And the products will be our leafs\n";

public static final String Facade = "Facade Design Pattern\n\n"
		+ "The Facade is, as the name suggests a facade\n"
		+ "It hides the complexities of the system and provides an interface to the client\n"
		+ "from where the client can access the system.\n"
		+ "In our example it will be a computer Facade, running everything while we only call one method\n";

public static final String Flyweight = "Flyweight Desgin Pattern\n\n"
		+ "Flyweight pattern is one structural design patterns\n"
		+ "It provides ways to decrease object count thus improving application required objects structure.\n"
		+ "We have Intrinsect Attributes that will not change in new objects\n"
		+ "And we also have Extrinsic Attributes, that may change in new objects\n"
		+ "In our example we have a Counter Strike match, the players will always be CT or T\n"
		+ "Their mission is the Intrinsic Attribute, a CT will always be a CT, the same goes for the T\n"
		+ "But their weapons will be Extrinsic Attributes, as they can pickup new ones every round\n";

public static final String Mediator = "Mediator Design Pattern\n\n"
		+ "Mediator enables decoupling of objects by introducing a layer\n"
		+ "in between so that the interaction between objects happen via the layer.\n"
		+ "In our example the IChatRoom is the Mediator\n"
		+ "The ChatRoom is the ConcreteMediator\n"
		+ "ChatUser defines the interface to communicate with other Users\n";

public static final String Memento = "Memento Design Pattern\n\n"
		+ "Memento pattern is used to restore state of an object to a previous state.\n"
		+ "As your application is progressing, you may want to save checkpoints in your\n"
		+ "application and restore back to those checkpoints later.\n";

public static final String Prototype = "Prototype Design Pattern\n\n"
		+ "Prototype allows us to hide the complexity of making new instances from the client.\n"
		+ "The concept is to copy an existing object rather than creating a new instance from scratch\n"
		+ "Something that may include costly operations.";

public static final String Proxy = "Proxy Design Pattern\n\n"
		+ "In proxy pattern, a class represents functionality of another class.\n"
		+ "This type of design pattern comes under structural pattern.\n"
		+ "In proxy pattern, we create object having original object to interface its functionality to outer world.\n";

public static final String Visitor = "Visitor Design Pattern\n\n"
		+ "It is used when we have to perform an operation on a group of similar kind of Objects.\n"
		+ "With the help of visitor pattern, we can move the operational logic from the objects to another class.\n";
}
