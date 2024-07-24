public class BookItem extends LibraryItem implements Book {
    
    private boolean available;

    public BookItem(String title, int itemNumber, boolean available) {
        super(title, itemNumber);
        this.available = available;
    }

    // Implementing the displayBookInfo method from the Book interface
    @Override
    public void displayBookInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Item Number: " + itemNumber);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    // Implementing the isAvailable method from the Book interface
    @Override
    public boolean isAvailable() {
        return available;
    }

    // Implementing the displayItem method from the LibraryItem abstract class
    @Override
    public void displayItem() {
        displayBookInfo();
    }

    // Implementing the isCheckedOut method from the LibraryItem abstract class
    @Override
    public boolean isCheckedOut() {
        return !available;
    }

    // Getter and setter for availability
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
