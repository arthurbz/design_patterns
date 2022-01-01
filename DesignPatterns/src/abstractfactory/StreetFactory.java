package abstractfactory;

public class StreetFactory extends AbstractFactory {
	/*
	 * The StreetFactory is in charge of
	 * creating the right Street object for X or Y
	 */
	@Override
	public Vehicle getVehicle(String model) {
		if (model.equalsIgnoreCase("X")) {
			return new XStreet();
		} else if (model.equalsIgnoreCase("Y")) {
			return new YStreet();
		}
		return null;
	}

}
