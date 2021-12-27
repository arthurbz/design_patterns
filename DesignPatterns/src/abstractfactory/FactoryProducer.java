package abstractfactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String variant) {
		if (variant.equalsIgnoreCase("OffRoad")) {
			return new OffRoadFactory();
		} else if (variant.equalsIgnoreCase("Street")) {
			return new StreetFactory();
		}
		return null;
	}
}
