package variables;

public class Book {

    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("-----------------------");
    }

    
    public static void main(String[] args) {
        // Creating two Book objects
        Book book1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 350.00);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 299.50);

        
        book1.displayDetails();
        book2.displayDetails();
    }
}

