class Book {
    String title;
    String author;

    Book(String title) {
        this.title = title;
        this.author = "Not provided";
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Clean Code", "Robert C. Martin");

        book1.display();
        book2.display();
    }
}