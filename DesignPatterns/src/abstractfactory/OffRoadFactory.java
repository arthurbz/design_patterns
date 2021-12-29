package abstractfactory;

public class OffRoadFactory extends AbstractFactory {
	/*
	 * The OffRoadFactory is in charge of
	 * creating the right OffRoad object for X or Y
	 */
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