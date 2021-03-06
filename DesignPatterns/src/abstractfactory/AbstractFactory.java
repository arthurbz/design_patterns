package abstractfactory;

/*Declares an interface for operations that create abstract objects*/
public abstract class AbstractFactory {
	public abstract Vehicle getVehicle(String model);
}
