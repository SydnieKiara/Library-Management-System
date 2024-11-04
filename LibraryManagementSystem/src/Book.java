/**
 * Abstract class representing a book.
 */
public abstract class Book {
    protected String title;
    protected String author;
    protected String ISBN;
    protected boolean isCheckedOut;

    /**
     * Constructor for the Book class.
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN of the book.
     */
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
    }

    /**
     * Marks the book as checked out.
     */
    public void checkOut() {
        this.isCheckedOut = true;
    }

    /**
     * Marks the book as returned.
     */
    public void returnBook() {
        this.isCheckedOut = false;
    }

    /**
     * Returns a description of the book.
     * @return A string describing the book.
     */
    public abstract String describe();
}
