public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  private String name;
  private int borrowNum=0;
  private String[] borrowBook=  new String[3];
  
  public static void bookStatus(){
    System.out.println("Available Books: ");
    for(int i=0; i<book_name.length;i++ ){
      System.out.println(book_name[i]+ " : "+book_count[i]);
    }
  }
  
  public Borrower(String name){
    this.name= name;;
  }
  
  public void borrowBook(String book){
    for(int i=0; i<book_name.length;i++ ){
      if(book_name[i]==book){
        if(book_count[i]>0){
          book_count[i]--;
          if(borrowNum<borrowBook.length){
            borrowBook[borrowNum] = book;
            borrowNum++;
          }
        }
        
        else{
          System.out.println("This book is not available.");
        }
      }
    }
  }
  
  
  
  public static int remainingBooks(String remain){
    for(int i=0; i<book_name.length;i++ ){
      if(book_name[i]==remain){
        return book_count[i];
      }
    }
    return -1;
  }
  
  public void borrowerDetails(){
    System.out.println("Name: "+ name+"\nBooks Borrowed: ");
    for(int i=0; i<borrowNum;i++ ){
      System.out.println(borrowBook[i]);
    }
  }
}











