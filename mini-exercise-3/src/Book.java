public interface Book {
    
    // Constant values
    String DEFAULT_AUTHOR = "Unknown Author";
    String DEFAULT_TITLE = "Untitled";

    // Method to display book information
    void displayBookInfo();

    // Method to check if the book is available
    boolean isAvailable();
}
