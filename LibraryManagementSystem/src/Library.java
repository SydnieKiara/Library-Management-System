import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a library.
 */
public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Staff> staff;

    /**
     * Constructor for the Library class.
     */
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        staff = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Adds a new member to the library.
     * @param member The member to be added.
     */
    public void addMember(Member member) {
        members.add(member);
    }

    /**
     * Adds a new staff member to the library.
     * @param staffMember The staff member to be added.
     */
    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    /**
     * Lists all books in the library.
     */
    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.describe());
        }
    }

    /**
     * Lists all members in the library.
     */
    public void listMembers() {
        for (Member member : members) {
            System.out.println(member.describe());
        }
    }

    /**
     * Lists all staff members in the library.
     */
    public void listStaff() {
        for (Staff staffMember : staff) {
            System.out.println(staffMember.describe());
        }
    }
}
