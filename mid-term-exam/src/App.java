public class App {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "VNL", 2022, 54678, 10.5);
        Bus bus = new Bus("Mercedes", "Sprinter", 2021, 78529, 30);

        truck.checkMileage();
        truck.conductRegularMaintenance();
        System.out.println("Toll Fee for the truck: $" + truck.calculateTollFee());
        truck.wheelServiceDue();

        System.out.println("");

        bus.checkMileage();
        bus.conductRegularMaintenance();
        System.out.println("Toll Fee for the bus: $" + bus.calculateTollFee());
        bus.airbagServiceDue();
    }
}
