public class Bus extends Vehicle {

    // Props
    private int passengerCapacity;

    // Constructors
    public Bus(String brand, String model, int year, double mileage, int passengerCapacity) {
        super(brand, model, year, mileage);
        this.passengerCapacity = passengerCapacity;
    }

    // Methods
    @Override
    public void conductRegularMaintenance() {
        super.conductRegularMaintenance();
        System.out.println("Checking bus-specific components for maintenance");
    }

    @Override
    public double calculateTollFee() {
        // Calculate toll fee based on passengerCapacity
        return passengerCapacity * 0.03; // $0.03 per ton
    }

    public void airbagServiceDue() {
        System.out.println("Airbag service is due for the bus.");
    }
}
