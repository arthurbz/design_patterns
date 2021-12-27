package abstractfactory;

public class OffRoadFactory extends AbstractFactory {
	@Override
	public Vehicle getVehicle(String model) {
		if (model.equalsIgnoreCase("X")) {
			return new XOffRoad();
		} else if (model.equalsIgnoreCase("Y")) {
			return new YOffRoad();
		}
		return null;
	}
}