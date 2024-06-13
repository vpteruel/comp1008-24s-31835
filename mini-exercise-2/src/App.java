public class App {
    public static void main(String[] args) throws Exception {
        // Create instances of Vehicle
        Vehicle car1 = new Vehicle("Red", 4, true);
        Vehicle car2 = new Vehicle("Blue", 2, false);

        // Print details and eco-friendliness
        System.out.println(car1);
        System.out.println("Is car1 eco-friendly? " + car1.isEcoFriendly());

        System.out.println(car2);
        System.out.println("Is car2 eco-friendly? " + car2.isEcoFriendly());

        // Create instance of Truck
        Truck truck1 = new Truck("Green", 2, false, 2, 0.0);
        Truck truck2 = new Truck("Black", 4, true, 5, 50.0);

        // Print details and eco-friendliness
        System.out.println(truck1);
        System.out.println("Is truck1 eco-friendly? " + truck1.isEcoFriendly());

        System.out.println(truck2);
        System.out.println("Is truck2 eco-friendly? " + truck2.isEcoFriendly());
    }
}
