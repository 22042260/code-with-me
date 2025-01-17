public class book {
    //private fields
    private String bookId;
    private String title;
    private String author;
    private int availableCopies;
    // constructor
    public Book(String bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        setAvailableCopies(availableCopies);
    }
   // getters and setters
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        if (availableCopies < 0) {
            throw new IllegalArgumentException("Available copies cannot be negative.");
        }
        this.availableCopies = availableCopies;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
        } else {
            throw new IllegalStateException("No copies available to borrow.");
        }
    }

    public void returnBook() {
        availableCopies++;
    }

    @Override
    public String toString() {
        return String.format("Book ID: %s, Title: %s, Author: %s, Available Copies: %d",
                bookId, title, author, availableCopies);
    }
}





