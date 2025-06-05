public class Product{
  private String name= "Unknown";
  private double pr= 0.0;
  private int quan;
  
  public Product(){
  }
  
  public void displayInfo(){
    System.out.println("Product Name: "+ name+"\nPrice: $"+ pr);
  }
  
  public void displayInfo(boolean status){
    System.out.println("Product Name: "+ name+"\nPrice: $"+ pr+"\nQuantity: "+ quan);
  }
  
  public Product(String name, double pr){
    this.name = name;
    this. pr= pr;
  }
  
  public void setQuantity( int quan){
    this.quan = quan;
  }
  
  public int getQuantity(){
    return quan;
  }
  
  public double getPrice(){
    return pr;
  }
}
  
  
  
  
  
  
  
  
  
  
  