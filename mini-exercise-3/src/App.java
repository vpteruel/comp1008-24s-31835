public class App {

    public static void main(String[] args) {
        
        // Create a new BookItem object
        BookItem book1 = new BookItem("Java Programming", 101, true);
        
        // Display book information
        System.out.println("Displaying Book Information:");
        book1.displayBookInfo();
        
        // Check if the book is available
        System.out.println("\nIs the book available?");
        System.out.println(book1.isAvailable() ? "Yes" : "No");
        
        // Display item information using the abstract class method
        System.out.println("\nDisplaying Item Information:");
        book1.displayItem();
        
        // Check if the book is checked out
        System.out.println("\nIs the book checked out?");
        System.out.println(book1.isCheckedOut() ? "Yes" : "No");
        
        // Change the availability of the book
        book1.setAvailable(false);
        
        // Display the updated book information
        System.out.println("\nDisplaying Updated Book Information:");
        book1.displayBookInfo();
        
        // Check if the book is available after update
        System.out.println("\nIs the book available after update?");
        System.out.println(book1.isAvailable() ? "Yes" : "No");
        
        // Check if the book is checked out after update
        System.out.println("\nIs the book checked out after update?");
        System.out.println(book1.isCheckedOut() ? "Yes" : "No");
    }
}
