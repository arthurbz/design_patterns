package bridge.Implementation;

public class Cargo implements Transport {
    @Override
    public void transport() {
        System.out.println("Transporting Cargo");
    }

    @Override
    public void transportDescription() {
        System.out.println("A vehicle that transport cargo");
    }
}