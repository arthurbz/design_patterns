package bridge.Abstraction;

import bridge.Implementation.Transport;

public abstract class BridgeVehicle {
    protected Transport transport;
    protected String brand;

    protected BridgeVehicle(String brand, Transport transporte){
        this.transport = transporte;
        this.brand = brand;
    }

    abstract public void work();
}
