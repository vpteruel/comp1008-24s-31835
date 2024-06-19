public class Truck extends Vehicle {

    // Props
    private double weight; // Weight in tons

    // Constructors
    public Truck(String brand, String model, int year, double mileage, double weight) {
        super(brand, model, year, mileage);
        this.weight = weight;
    }

    // Methods
    @Override
    public void conductRegularMaintenance() {
        super.conductRegularMaintenance();
        System.out.println("Checking truck-specific components for maintenance");
    }

    @Override
    public double calculateTollFee() {
        // Calculate toll fee based on weight
        return weight * 0.05; // $0.05 per ton
    }

    public void wheelServiceDue() {
        System.out.println("Wheel service is due for the trunk.");
    }
}
