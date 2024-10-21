class Book {
    private String title;
    private String author;
    private String isbn;
    private int publishedYear;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String isbn) {
        this(title, author);
        this.isbn = isbn;
    }

    public Book(String title, String author, String isbn, int publishedYear) {
        this(title, author, isbn);
        this.publishedYear = publishedYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (isbn != null) {
            System.out.println("ISBN: " + isbn);
        }
        if (publishedYear != 0) {
            System.out.println("Published Year: " + publishedYear);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", 1925);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
