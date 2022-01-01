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

	/*Abstract Factory*/
	public static void abstractFactory() {
		System.out.println("Abstract Factory Design Pattern\n");
		
		AbstractFactory offRoadFactory = FactoryProducer.getFactory("OffRoad");
		Vehicle car1 = offRoadFactory.getVehicle("X");
		car1.method();
		Vehicle car2 = offRoadFactory.getVehicle("Y");
		car2.method();
		
		AbstractFactory streetFactory = FactoryProducer.getFactory("Street");
		Vehicle car3 = streetFactory.getVehicle("X");
		car3.method();
		Vehicle car4 = streetFactory.getVehicle("Y");
		car4.method();
	}
	
	/*Bridge*/
	public static void bridge() {
		System.out.println("Bridge Design Pattern\n");
		
		BridgeVehicle truck = new Truck("Scania", new Cargo());
        truck.work();
        
        BridgeVehicle bus = new Bus("Mercedes", new People());
        bus.work();
	}
	
	/*Builder*/
	public static void builder() {
		System.out.println("Builder Design Pattern\n");
        
		Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
	}

	public static void chainOfResponsibility() {
		System.out.println("Chain of Responsibility Design Pattern\n");
		
		LogInfoHandler logInfoHandler = new LogInfoHandler();
		LogWarningHandler logWarningHandler = new LogWarningHandler();
		LogErrorHandler logErrorHandler = new LogErrorHandler();
		
		logInfoHandler.next(logWarningHandler);
		logWarningHandler.next(logErrorHandler);
		
		String response = logInfoHandler.handle("error");
		System.out.println(response);
	}
	
	/*Composite*/
	public static void composite() {
		System.out.println("Composite Design Pattern\n");
		
		Box mainBox = new Box(new ArrayList<Item>());
		mainBox.addItem(new Product("Clean Code: A Handbook of Agile Software Craftsmanship", 200.90));
		
		Box smartphoneBox = new Box(new ArrayList<Item>());
		smartphoneBox.addItem(new Product("Samsung Galaxy S21 Ultra 5G", 3000));
		smartphoneBox.addItem(new Product("Samsung Galaxy S20 FE", 2000));
		smartphoneBox.addItem(new Product("iPhone 13", 2000));
		smartphoneBox.addItem(new Product("iPhone 12", 1500));
		mainBox.addItem(smartphoneBox);
		
		Box laptopBox = new Box(new ArrayList<Item>());
		laptopBox.addItem(new Product("Acer Nitro AN515-44-R5YZ", 5499));
		laptopBox.addItem(new Product("Dell G15", 5301));
		mainBox.addItem(laptopBox);
		
		Box booksBox = new Box(new ArrayList<Item>());
		booksBox.addItem(new Product("Marcus Aurelius - Meditations", 12.30));
		booksBox.addItem(new Product("The Hitchhikers Guide to the Galaxy - Douglas Adams", 17.10));
		booksBox.addItem(new Product("Learning Deep Learning - Random Author", 25));
		mainBox.addItem(booksBox);

		System.out.println("Total Price: " + mainBox.calculatePrice());
	}
	
	/*Facade*/
	public static void facade() {
		System.out.println("Facade Design Pattern\n");
		
		FacadeComputer computer = new FacadeComputer();
		computer.run();
	}
	
	/*Flyweight*/
	public static void flyweight() {
		System.out.println("Flyweight Design Pattern\n");
		
		Random random = new Random();
		String[] playerType = {"Terrorist", "CounterTerrorist"};
		String[] weapons = {"AK-47", "AWP", "Knife", "Desert Eagle"};
		
        for (int i = 0; i < 4; i++) {
            Player player = PlayerFactory.getPlayer(playerType[random.nextInt(playerType.length)]);

            player.assignWeapon(weapons[random.nextInt(weapons.length)]);

            player.mission();
        }
	}
	
	/*Mediator*/
	public static void mediator() {
		System.out.println("Mediator Design Pattern\n");
		
        IChatRoom chatroom = new ChatRoom();
        
        User user1 = new ChatUser(chatroom,"1", "Lewis");
        User user2 = new ChatUser(chatroom,"2", "Max");
        User user3 = new ChatUser(chatroom,"3", "Lando");
        User user4 = new ChatUser(chatroom,"4", "Pierre");
         
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user1.send("Top of the morning", "2");
        user2.send("Hey buddy", "1");
	}
	
	/*Memento*/
	public static void memento() {
		System.out.println("Memento Design Pattern\n");

		Originator originator = new Originator();
	    History history = new History();
	    
	    originator.setState("State #1");
	    
	    originator.setState("State #2");
	    history.saveState(originator.generateMemento());
	    
	    originator.setState("State #3");
	    history.saveState(originator.generateMemento());
	    
	    originator.setState("State #4");
	    System.out.println("Current State: " + originator.getState());		
	    
	    originator.setStateFromMemento(history.getState(0));
	    System.out.println("First saved State ----- " + originator.getState());
	    
	    originator.setStateFromMemento(history.getState(1));
	    System.out.println("Second saved State ----- " + originator.getState());
	}
	
	/*Prototype*/
	public static void prototype() {
		System.out.println("Prototype\n");
        int eid = 123; //Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        //System.out.print("Enter Employee Name: ");  
        String ename = "Elliot"; //br.readLine();  
        System.out.print("\n");  
          
        //System.out.print("Enter Employee Designation: ");  
        String edesignation = "Security team"; //br.readLine();  
        System.out.print("\n");  
          
        //System.out.print("Enter Employee Address: ");  
        String eaddress = "Church Ave, Brookly, NY 11226"; //br.readLine();  
        System.out.print("\n");  
          
        //System.out.print("Enter Employee Salary: ");  
        double esalary = 999999.99; //Double.parseDouble(br.readLine());  
        System.out.print("\n");  
           
        EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);  
          
        e1.showRecord();  
        System.out.println("\n");  
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();  
        e2.showRecord(); 
	}
	
	/*Proxy*/
	public static void proxy() {
		System.out.println("Proxy Design Pattern\n");
		
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
	
	/*Visitor*/
	public static void visitor() {
		System.out.println("Visitor Design Pattern\n");
		
		ConcreteElement concreteElement = new ConcreteElement();
		ConcreteVistor concreteVisitor = new ConcreteVistor();
		concreteElement.accept(concreteVisitor);
	}
}
