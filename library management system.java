public class librarymanagementsystem {
    
    public static void main(String[] args) {
         // Creating books 
         Book book1 = new Book("Shadow Hunters"); 
         Book book2 = new Book("Percy jackson and the Lightening Thief");
         Book book3 = new Book("Boy Nobody"); 
         Book book4 = new Book("The Catcher in the Rye"); 
         Book book5 = new Book("Alex Rider");

// Creating members
 Member member1 = new Member("Kelvin"); 
 Member member2 = new Member("Marcus"); 
 Member member3 = new Member("Angela");

// Borrowing and returning books
 member1.borrowBook(book1); 
 member2.borrowBook(book2); 
 member3.borrowBook(book3); 
 member1.returnBook(book1);
 member2.returnBook(book2); 
 member3.returnBook(book3); 
 // Trying to borrow a book that's already borrowed
  member1.borrowBook(book2);


    }

}
