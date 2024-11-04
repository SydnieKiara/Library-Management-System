public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Fiction("1984", "George Orwell", "1234567890");
        Book book2 = new NonFiction("Sapiens", "Yuval Noah Harari", "0987654321");

        // Create members
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        // Create staff
        Staff staff1 = new Staff("Charlie", "S001");

        // Register books and members
        staff1.registerBook(library, book1);
        staff1.registerBook(library, book2);
        staff1.registerMember(library, member1);
        staff1.registerMember(library, member2);

        // List books, members, and staff
        System.out.println("Books in the library:");
        library.listBooks();

        System.out.println("\nMembers in the library:");
        library.listMembers();

        System.out.println("\nStaff in the library:");
        library.listStaff();

        // Check out and return a book
        book1.checkOut();
        System.out.println("\nAfter checking out '1984':");
        library.listBooks();

        book1.returnBook();
        System.out.println("\nAfter returning '1984':");
        library.listBooks();
    }
}

