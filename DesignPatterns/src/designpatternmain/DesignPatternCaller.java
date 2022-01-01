package designpatternmain;

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
        System.out.println(" ---------------------------------------- ");
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
	}
	
	public static void composite() {
		System.out.println("Composite Design Pattern\n");
	}
	
	public static void facade() {
		System.out.println("Facade Design Pattern\n");
	}
	
	public static void flyweight() {
		System.out.println("Flyweight Design Pattern\n");
	}
	
	public static void mediator() {
		System.out.println("Mediator Design Pattern\n");
	}
	
	public static void memento() {
		System.out.println("Memento Design Pattern\n");
	}
	
	public static void prototype() {
		System.out.println("Prototype\n");
	}
	
	public static void proxy() {
		System.out.println("Proxy Design Pattern\n");
	}
	
	public static void visitor() {
		System.out.println("Visitor Design Pattern\n");
	}
}
