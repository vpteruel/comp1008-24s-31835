public class HouseRunner {
    public static void main(String[] args) {
        // Instantiating the House objects in 3 unique ways
        House house1 = new House(); // Using the default constructor
        House house2 = new House("123 Main St.", 4); // Using the constructor with address and numberOfRooms parameters
        House house3 = new House(150000.0); // Using the constructor with price parameter

        // Outputting the values of instance variables using printf
        System.out.printf("House 1: Address=%s, Number of Rooms=%d, Price=%.2f%n",
                house1.getAddress(), house1.getNumberOfRooms(), house1.getPrice());

        System.out.printf("House 2: Address=%s, Number of Rooms=%d, Price=%.2f%n",
                house2.getAddress(), house2.getNumberOfRooms(), house2.getPrice());

        System.out.printf("House 3: Address=%s, Number of Rooms=%d, Price=%.2f%n",
                house3.getAddress(), house3.getNumberOfRooms(), house3.getPrice());
    }
}
