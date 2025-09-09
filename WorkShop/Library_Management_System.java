package WorkShop;
import java.util.*;
class Book{
	String title;
	String author;
	boolean status;
	
	Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = true;
    }
	public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + status);
    }
}

public class Library_Management_System {
	static Book[] books = {
	        new Book("Java Programming", "James Gosling"),
	        new Book("fvnddlks", "fnskjfksz"),
	        new Book("vmfklfm", "acmaldcmf")
	    }; 
	
	static void searchBooks(String name) {
        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.toLowerCase().contains(name.toLowerCase())) {
                books[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching books found.");
        }
    }
	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Search Book");
            System.out.println("2. Checkout Book");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.print("Enter partial book title: ");
                String name = sc.nextLine();
                searchBooks(name);
            } else if (option == 2) {
                System.out.print("Enter exact book title to checkout: ");
                String title = sc.nextLine();
                
            } else if (option == 3) {
                System.out.println("Exiting system.");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        
	}
}
