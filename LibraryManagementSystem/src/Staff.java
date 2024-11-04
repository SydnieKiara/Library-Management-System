/**
 * Class representing a library staff member.
 */
public class Staff extends Person {
    public Staff(String name, String id) {
        super(name, id);
    }

    @Override
    public String describe() {
        return "Staff: " + name + " (ID: " + id + ")";
    }

    /**
     * Registers a new member in the library.
     * @param library The library where the member is registered.
     * @param member The member to be registered.
     */
    public void registerMember(Library library, Member member) {
        library.addMember(member);
    }

    /**
     * Registers a new book in the library.
     * @param library The library where the book is registered.
     * @param book The book to be registered.
     */
    public void registerBook(Library library, Book book) {
        library.addBook(book);
    }
}
