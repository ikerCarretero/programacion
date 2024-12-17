import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Library {
    private List<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void printBooks() {
        for (Book book : bookList) {
            System.out.println("Títol: " + book.getTitle() + ", Autor: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("El Quixot", "Miguel de Cervantes", "123456"));
        library.addBook(new Book("Cien Años de Soledad", "Gabriel García Márquez", "7891011"));
        
        System.out.println("Llibres a la biblioteca:");
        library.printBooks();

        Book searchedBook = library.findBookByIsbn("123456");
        if (searchedBook != null) {
            System.out.println("Llibre trobat: " + searchedBook.getTitle());
        } else {
            System.out.println("Llibre no trobat.");
        }
    }
}
