public class Cart {
  int cartNum,dis, count=0;
  double  sum, tk,total;
  String name;
  String[] arr1= new String[3];
  double[] arr2= new double[3];
  
  public void create_cart(int cartNum){
    this. cartNum= cartNum;
  }
  
  public void addItem(String name, double tk ){
    this. name= name;
    this. tk= tk;
    
    if(count<3){
      arr1[count] = name;
      System.out.println(name+" added to cart "+ cartNum+".\nYou have "+(count+1)+" item(s) in your cart now.");
      arr2[count] = tk ;
      count++;   
    }
    else {
      System.out.println("You already have 3 items on your cart");
    }
  }
  
  public void addItem( double tk, String name ){
    this. name= name;
    this. tk= tk;
    
    if(count<3){
      arr1[count] = name;
      System.out.println(name+" added to cart "+ cartNum+".\nYou have "+(count+1)+" item(s) in your cart now.");
      arr2[count] = tk ;
      count++;   
    }
    else {
      System.out.println("You already have 3 items on your cart");
    }
  }
  
  public void giveDiscount(int dis){
    this. dis= dis;
  }
  
  public void cartDetails(){
    System.out.println("Your cart(c"+cartNum+") :");
    sum=0;
    for(int i=0; i<count; i++){
      sum+= arr2[i];
      
      System.out.println(arr1[i]+" - "+arr2[i]);
      
      
    }
    total= sum - (sum*dis/100);
    System.out.println("Discount Applied: "+ dis+"%\nTotal price: "+total);
  }
}












