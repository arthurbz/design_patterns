package bridge;

import bridge.Abstraction.Truck;
import bridge.Abstraction.Bus;
import bridge.Abstraction.Vehicle;
import bridge.Implementation.Cargo;
import bridge.Implementation.People;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ---------------------------------------- ");

        Vehicle truck = new Truck("Scania", new Cargo());
        truck.work();

        System.out.println(" ---------------------------------------- ");

        Vehicle bus = new Bus("Mercedes", new People());
        bus.work();

        System.out.println(" ---------------------------------------- ");
    }
}
