package flyweight;

class CounterTerrorist implements Player {
	// Intrinsic Attribute
    private final String TASK;
  
    // Extrinsic Attribute
    private String weapon;
  
    public CounterTerrorist() {
        TASK = "DEFUSE THE BOMB";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("\nCounter Terrorist | Weapon " + weapon + " | " + TASK);
    }
}
