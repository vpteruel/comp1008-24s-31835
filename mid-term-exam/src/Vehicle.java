public class Vehicle {

    // Props
    private String brand;
    private String model;
    private int year;
    private double mileage;

    // Constructors
    public Vehicle(String brand, String model, int year) {
        this(brand, model, year, 0.0);
    }

    public Vehicle(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Methods
    public void checkMileage() {
        System.out.println("Mileage: " + mileage + " miles");
    }

    public void conductRegularMaintenance() {
        System.out.println("Performing regular maintenance for " + brand + " " + model + " " + year);
    }

    public double calculateTollFee() {
        return 0.00;
    }
}
