package bridge.Abstraction;

import bridge.Implementation.Transport;

public abstract class Vehicle {
    protected Transport transport;
    protected String brand;

    protected Vehicle(String brand, Transport transporte){
        this.transport = transporte;
        this.brand = brand;
    }

    abstract public void work();
}
