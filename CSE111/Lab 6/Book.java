public class Book{
  public static int total_books_sold=0 ;
  public static double total_revenue=0.0;
  private String book;
  private int dis;
  private double price;
  
  public Book(String book, int dis){
    this.book= book;
    this.dis = dis;
    total_books_sold++;
  }
  
  public double getPrice(){
    this.price = 150-150*(dis/100.0);
    total_revenue+= this.price;
      return price;
  }
  
  public void bookDetails(){
    System.out.println("Title: "+ book+"\nPrice after Discount: "+ getPrice()+" TK");
  }
}