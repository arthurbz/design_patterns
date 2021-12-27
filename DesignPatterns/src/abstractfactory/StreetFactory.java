package abstractfactory;

public class StreetFactory extends AbstractFactory {

	@Override
	Vehicle getVehicle(String model) {
		if (model.equalsIgnoreCase("X")) {
			return new XStreet();
		} else if (model.equalsIgnoreCase("Y")) {
			return new YStreet();
		}
		return null;
	}

}
