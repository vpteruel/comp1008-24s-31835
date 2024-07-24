public abstract class LibraryItem {
    
    // Instance variables
    private String title;
    private int itemNumber;

    // Constructor
    public LibraryItem(String title, int itemNumber) {
        this.title = title;
        this.itemNumber = itemNumber;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Abstract method to display book items
    public abstract void displayItem();

    // Abstract method to check if the book is checked out or not
    public abstract boolean isCheckedOut();
}
