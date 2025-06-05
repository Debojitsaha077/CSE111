public class Tester {
    public static void main(String[] args) {
        Borrower.bookStatus();
        
        Borrower b1 = new Borrower("Nabila");
        b1.borrowBook(0); // Pather Panchali
        b1.borrowBook(3); // Ananthmath
        b1.borrowDetails();
        
        Borrower b2 = new Borrower("Sadia");
        b2.borrowBook(3); // Ananthmath
        b2.borrowBook(1); // Durgesh Nandini
        b2.borrowBook(0); // Pather Panchali
        b2.borrowDetails();
        
        System.out.println(Borrower.remainingBooks(3) + " copies of Ananthmath is remaining.");
        
        Borrower b3 = new Borrower("Anika");
        b3.borrowBook(3); // Ananthmath
        b3.borrowDetails();
        
        Borrower b4 = new Borrower("Oishi");
        b4.borrowBook(2); // Durgesh Nandini
        b4.borrowDetails();
    }
}