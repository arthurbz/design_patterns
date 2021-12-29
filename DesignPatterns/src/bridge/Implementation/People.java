package bridge.Implementation;

public class People implements Transport {
    @Override
    public void transport() {
        System.out.println("Transporting People");
    }

    @Override
    public void transportDescription() {
        System.out.println("A vehicle that transport people");
    }
}
