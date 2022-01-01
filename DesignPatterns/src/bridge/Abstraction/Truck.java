package bridge.Abstraction;

import bridge.Implementation.Transport;

public class Truck extends BridgeVehicle {

	public Truck(String brand, Transport transport) {
        super(brand, transport);
    }

    @Override
    public void work() {
        System.out.print(brand + " truck: ");
        this.transport.transport();
    }
}
