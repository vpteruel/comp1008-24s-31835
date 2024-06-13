public class Truck extends Vehicle {

    // Props
    public int seats;
    protected double trunkSpace;

    // Constructor
    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Truck { " +
                "color = '" + getColor() + "'" +
                ", numberOfDoors = " + numberOfDoors +
                ", gasPowered = " + gasPowered +
                ", seats = " + seats +
                ", trunkSpace = " + trunkSpace +
                " }";
    }

    // Override isEcoFriendly method
    @Override
    public boolean isEcoFriendly() {
        return super.isEcoFriendly() && seats <= 2 && trunkSpace == 0.0;
    }
}
