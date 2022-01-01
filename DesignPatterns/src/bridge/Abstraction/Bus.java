package bridge.Abstraction;

import bridge.Implementation.Transport;

public class Bus extends BridgeVehicle {

	public Bus(String brand, Transport transport) {
        super(brand, transport);
    }

    @Override
    public void work() {
        System.out.print(brand + " bus: ");
        this.transport.transport();
    }
}