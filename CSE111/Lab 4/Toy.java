public class Toy{
  String name,name2;
  int price;
  public Toy(String name, int price){
    this.name = name;
    this.price = price;
    System.out.println("A new toy has been made!");
  }
  
  public void updatePrice(int price){
    this.price = price;
  }
  
    
  public void updateName(String name2){
    this.name2= name2;
    System.out.println("Changing old name: "+ name+"\nnew name: "+name2);
  
  }
  
  
  public void showPrice(){
    System.out.println("price: "+ price+" Taka");
  }
}