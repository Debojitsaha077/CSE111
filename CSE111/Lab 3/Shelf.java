public class  Shelf{
  public int capacity =0;
  public int book = 0;
  
  public void showDetails(){
    System.out.println("Shelf capacity: "+capacity+"\n"+"Number of books: "+book);
  }
  
  public void addBooks(int book2){
    if(capacity ==0){
      System.out.println("Zero capacity. Cannot add books.");
    }
    else if((book + book2)> capacity){
      System.out.println("Exceeds capacity");
    }
    else{
      this.book += book2;
      System.out.println(book2 + " books added to shelf");
    }
  }
}