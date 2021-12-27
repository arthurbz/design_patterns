package abstractfactory;

public class Main {

	public static void main(String[] args) {
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
}
