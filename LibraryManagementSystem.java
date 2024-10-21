import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book bl = LibraryScanner.scan();
        bl.display();
    }

    static class Book {
        String title;
        String genre;
        String rating;
        double price;
        int available;

        public Book(String title, String genre, String rating, double price, int available) {
            this.title = title;
            this.genre = genre;
            this.rating = rating;
            this.price = price;
            this.available = available;
        }

        public void display() {
            System.out.println("\nTitle: " + title);
            System.out.println("Genre: " + genre);
            System.out.println("Rating: " + rating);
            System.out.println("Price: " + price);
            System.out.println("Available Copies: " + available);
        }
    }

    static class LibraryScanner {

        public static Book scan() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter title of the book: ");
            String title = sc.nextLine();

            System.out.print("Enter genre of the book: ");
            String genre = sc.nextLine();

            System.out.print("Enter rating of the book (A, B, C): ");
            String rating = sc.nextLine();

            System.out.print("Enter price of the book: ");
            double price = sc.nextDouble();

            System.out.print("Enter available copies of the book: ");
            int available = sc.nextInt();

            return new Book(title, genre, rating, price, available);
        }
    }
}