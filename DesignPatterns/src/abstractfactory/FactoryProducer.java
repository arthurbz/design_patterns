package abstractfactory;

public class FactoryProducer {
	
	/*
	 * Method responsible for creating the factories
	 * If car (no matter if Y or X) is OffRoad we return an OffRoad factory
	 */
	public static AbstractFactory getFactory(String variant) {
		if (variant.equalsIgnoreCase("OffRoad")) {
			return new OffRoadFactory();
		} else if (variant.equalsIgnoreCase("Street")) {
			return new StreetFactory();
		}
		return null;
	}
}
