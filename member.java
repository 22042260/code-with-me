import java.util.ArrayList;

public class member {
      private String memberId;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (!borrowedBooks.contains(book) && book.getAvailableCopies() > 0) {
            borrowedBooks.add(book);
            book.borrowBook();
        } else {
            throw new IllegalStateException("Cannot borrow the book. It may be already borrowed or not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
        } else {
            throw new IllegalStateException("This book was not borrowed by the member.");
        }
    }

    @Override
    public String toString() {
        return String.format("Member ID: %s, Name: %s, Borrowed Books: %s",
                memberId, name, borrowedBooks);
    }
}
