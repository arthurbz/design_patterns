package bridge;

import bridge.Abstraction.Truck;
import bridge.Abstraction.Bus;
import bridge.Abstraction.BridgeVehicle;
import bridge.Implementation.Cargo;
import bridge.Implementation.People;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ---------------------------------------- ");

        BridgeVehicle truck = new Truck("Scania", new Cargo());
        truck.work();

        System.out.println(" ---------------------------------------- ");

        BridgeVehicle bus = new Bus("Mercedes", new People());
        bus.work();

        System.out.println(" ---------------------------------------- ");
    }
}
