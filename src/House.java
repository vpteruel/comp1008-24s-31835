public class House {
    // Instance variables with unique data types and accessibility levels
    private String address;
    public int numberOfRooms;
    protected double price;

    // Default constructor
    public House() {
        address = "Unknown";
        numberOfRooms = 0;
        price = 0.0;
    }

    // Constructor with address parameter
    public House(String address) {
        this.address = address;
        numberOfRooms = 0;
        price = 0.0;
    }

    // Constructor with numberOfRooms parameter
    public House(int numberOfRooms) {
        address = "Unknown";
        this.numberOfRooms = numberOfRooms;
        price = 0.0;
    }

    // Constructor with price parameter
    public House(double price) {
        address = "Unknown";
        numberOfRooms = 0;
        this.price = price;
    }

    // Constructor with address and numberOfRooms parameters
    public House(String address, int numberOfRooms) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        price = 0.0;
    }

    // Constructor with address and price parameters
    public House(String address, double price) {
        this.address = address;
        numberOfRooms = 0;
        this.price = price;
    }

    // Constructor with numberOfRooms and price parameters
    public House(int numberOfRooms, double price) {
        address = "Unknown";
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    // Getter and setter methods 
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
