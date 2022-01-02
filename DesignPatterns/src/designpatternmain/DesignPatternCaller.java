package designpatternmain;

import java.util.ArrayList;
import java.util.Random;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.Vehicle;
import bridge.Abstraction.Truck;
import bridge.Abstraction.Bus;
import bridge.Abstraction.BridgeVehicle;
import bridge.Implementation.Cargo;
import bridge.Implementation.People;
import builder.builders.CarBuilder;
import builder.builders.CarManualBuilder;
import builder.cars.Car;
import builder.cars.Manual;
import builder.director.Director;
import chainofresponsibility.LogErrorHandler;
import chainofresponsibility.LogInfoHandler;
import chainofresponsibility.LogWarningHandler;
import composite.Box;
import composite.Item;
import composite.Product;
import facade.FacadeComputer;
import flyweight.Player;
import flyweight.PlayerFactory;
import mediator.ChatRoom;
import mediator.ChatUser;
import mediator.IChatRoom;
import mediator.User;
import memento.History;
import memento.Originator;
import prototype.EmployeeRecord;
import proxy.College;
import proxy.CollegeProxy;
import visitor.ConcreteElement;
import visitor.ConcreteVistor;

public class DesignPatternCaller {

	/* Abstract Factory */
	public static void abstractFactory() {
		//Use the AbstractFactory to create a Factory for OffRoad Vehicles
		AbstractFactory offRoadFactory = FactoryProducer.getFactory("OffRoad");
		// With the OffRoad Factory created we can produce each OffRoad vehicle
		Vehicle car1 = offRoadFactory.getVehicle("X");
		car1.method();
		Vehicle car2 = offRoadFactory.getVehicle("Y");
		car2.method();

		//Use the AbstractFactory to create a Factory for Street Vehicles
		AbstractFactory streetFactory = FactoryProducer.getFactory("Street");
		// With the Street Factory created we can produce each Street vehicle
		Vehicle car3 = streetFactory.getVehicle("X");
		car3.method();
		Vehicle car4 = streetFactory.getVehicle("Y");
		car4.method();
	}

	/* Bridge */
	public static void bridge() {
		//Create a Truck Vehicle with the Cargo implementation
		BridgeVehicle truck = new Truck("Scania", new Cargo());
		truck.work();

		//Create a Bus Vehicle with the People implementation
		BridgeVehicle bus = new Bus("Mercedes", new People());
		bus.work();
	}

	/* Builder */
	public static void builder() {
		//Create a Director responsible of assembling the car
		Director director = new Director();
		//Create a Builder responsible of defining all the steps
		CarBuilder builder = new CarBuilder();
		//Build a SportsCar using its constructor
		director.constructSportsCar(builder);
		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.getCarType());
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n" + carManual.print());
	}

	public static void chainOfResponsibility() {
		//Creating Handlers of the request
		LogInfoHandler logInfoHandler = new LogInfoHandler();
		LogWarningHandler logWarningHandler = new LogWarningHandler();
		LogErrorHandler logErrorHandler = new LogErrorHandler();

		logInfoHandler.next(logWarningHandler);
		logWarningHandler.next(logErrorHandler);
		
		String response = logInfoHandler.handle("error");
		System.out.println(response);
	}

	/* Composite */
	public static void composite() {
		//Item class is the Component, which will be Extended by the Box class
		//Creates the main box, the top node
		Box mainBox = new Box(new ArrayList<Item>());
		mainBox.addItem(new Product("Clean Code: A Handbook of Agile Software Craftsmanship", 200.90));

		//Creating another composite, new box with new children
		Box smartphoneBox = new Box(new ArrayList<Item>());
		//Leaf - primitive objects in the composition
		smartphoneBox.addItem(new Product("Samsung Galaxy S21 Ultra 5G", 3000));
		smartphoneBox.addItem(new Product("Samsung Galaxy S20 FE", 2000));
		smartphoneBox.addItem(new Product("iPhone 13", 2000));
		smartphoneBox.addItem(new Product("iPhone 12", 1500));
		mainBox.addItem(smartphoneBox);

		//Composite with product children
		Box laptopBox = new Box(new ArrayList<Item>());
		//New products = new leafs
		laptopBox.addItem(new Product("Acer Nitro AN515-44-R5YZ", 5499));
		laptopBox.addItem(new Product("Dell G15", 5301));
		mainBox.addItem(laptopBox);

		Box booksBox = new Box(new ArrayList<Item>());
		booksBox.addItem(new Product("Marcus Aurelius - Meditations", 12.30));
		booksBox.addItem(new Product("The Hitchhikers Guide to the Galaxy - Douglas Adams", 17.10));
		booksBox.addItem(new Product("Learning Deep Learning - Random Author", 25));
		mainBox.addItem(booksBox);

		//Calls a composite method
		System.out.println("Total Price: " + mainBox.calculatePrice());
	}

	/* Facade */
	public static void facade() {
		/*
		 * This Facade runs all the methods of the computer
		 * While we only call one method, it does all the job for us
		 * Thats the purpose of the Facade Design Pattern
		 */
		FacadeComputer computer = new FacadeComputer();
		computer.run();
	}

	/* Flyweight */
	public static void flyweight() {
		Random random = new Random();
		//Intrinsic Attribute of the objects, it won't ever change
		String[] playerType = { "Terrorist", "CounterTerrorist" };
		//Extrinsic Attribute, it may change from object to object
		String[] weapons = { "AK-47", "AWP", "Knife", "Desert Eagle" };

		for (int i = 0; i < 4; i++) {
			//In the Factory, it uses the same object to generate new ones
			Player player = PlayerFactory.getPlayer(playerType[random.nextInt(playerType.length)]);
			player.assignWeapon(weapons[random.nextInt(weapons.length)]);
			player.mission();
		}
	}

	/* Mediator */
	public static void mediator() {
		//IChatRoom Defines the interface for communication between users
		//ChatRoom implements the Mediator interface
		IChatRoom chatroom = new ChatRoom();

		//ChatUser defines the interface for communication with other users
		User user1 = new ChatUser(chatroom, "1", "Lewis");
		User user2 = new ChatUser(chatroom, "2", "Max");
		User user3 = new ChatUser(chatroom, "3", "Lando");
		User user4 = new ChatUser(chatroom, "4", "Pierre");

		//Add users to the chat
		chatroom.addUser(user1);
		chatroom.addUser(user2);
		chatroom.addUser(user3);
		chatroom.addUser(user4);

		user1.send("Top of the morning", "2");
		user2.send("Hey buddy", "1");
	}

	/* Memento */
	public static void memento() {
		//Object for which the state is to be saved
		Originator originator = new Originator();
		History history = new History();

		//Save State #1
		originator.setState("State #1");
		//Save State #2
		originator.setState("State #2");
		history.saveState(originator.generateMemento());
		//Save State #3
		originator.setState("State #3");
		history.saveState(originator.generateMemento());
		//Save State #4
		originator.setState("State #4");
		System.out.println("Current State: " + originator.getState());

		originator.setStateFromMemento(history.getState(0));
		System.out.println("First saved State ----- " + originator.getState());

		originator.setStateFromMemento(history.getState(1));
		System.out.println("Second saved State ----- " + originator.getState());
	}

	/* Prototype */
	public static void prototype() {
		int eid = 123; // Integer.parseInt(br.readLine());
		System.out.print("\n");

		// System.out.print("Enter Employee Name: ");
		String ename = "Elliot"; // br.readLine();
		System.out.print("\n");

		// System.out.print("Enter Employee Designation: ");
		String edesignation = "Security team"; // br.readLine();
		System.out.print("\n");

		// System.out.print("Enter Employee Address: ");
		String eaddress = "Church Ave, Brookly, NY 11226"; // br.readLine();
		System.out.print("\n");

		// System.out.print("Enter Employee Salary: ");
		double esalary = 999999.99; // Double.parseDouble(br.readLine());
		System.out.print("\n");

		EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);

		e1.showRecord();
		System.out.println("\n");
		EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
		e2.showRecord();
	}

	/* Proxy */
	public static void proxy() {
		//Proxy to represent functionality of another class
		College college = new CollegeProxy("Wrong");
		System.out.println("Incorrect Login");
		System.out.println(college.getCollegeName());
		System.out.println(college.getCourseName());
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("");
		college = new CollegeProxy("OK");
		System.out.println("Correct Login");
		System.out.println(college.getCollegeName());
		System.out.println(college.getCourseName());
	}

	/* Visitor */
	public static void visitor() {
		ConcreteElement concreteElement = new ConcreteElement();
		//Implemented by the visitor and is called for every element in the data structure
		ConcreteVistor concreteVisitor = new ConcreteVistor();
		//Methods that accept a visitor
		concreteElement.accept(concreteVisitor);
	}
}
