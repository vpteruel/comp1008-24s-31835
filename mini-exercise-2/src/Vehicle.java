public class Vehicle {
    
    // Props
    private String color;
    protected int numberOfDoors;
    boolean gasPowered;

    // Constructors
    public Vehicle(String color, int numberOfDoors, boolean gasPowered) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.gasPowered = gasPowered;
    }

    public Vehicle(String color) {
        this(color, 4, true); // Default values for numberOfDoors and gasPowered
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isGasPowered() {
        return gasPowered;
    }

    public void setGasPowered(boolean gasPowered) {
        this.gasPowered = gasPowered;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Vehicle { " +
                "color = '" + color + "'" +
                ", numberOfDoors = " + numberOfDoors +
                ", gasPowered = " + gasPowered +
                " }";
    }

    // isEcoFriendly method
    public boolean isEcoFriendly() {
        return numberOfDoors == 2 && !gasPowered;
    }
}
