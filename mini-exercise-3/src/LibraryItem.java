public abstract class LibraryItem {
    
    // Instance variables
    private String title;
    private int itemNumber;

    // Constructor
    public LibraryItem(String title, int itemNumber) {
        this.title = title;
        this.itemNumber = itemNumber;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    // Abstract method to display book items
    public abstract void displayItem();

    // Abstract method to check if the book is checked out or not
    public abstract boolean isCheckedOut();
}
