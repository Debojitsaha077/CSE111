public class Bike extends Vehicle{
  String nm ;
  int wh;
  boolean status;
  
  public Bike(String com, String nm , int yr, int wh, boolean status){
    super(com, yr);
    setWheels(2);
    this.nm=nm;
    this.wh=wh;
    this.status=status;
    //System.out.println( );
  }
  
  
  public String toString(){
    System.out.print("Bike " );
    return super.toString()+ " Model: "+ nm+ ", SideCar: "+ status;
  }
  
  public void doAWheelie(){
    if(!status){
      System.out.println("Wheelie Failed. "+ getBrand()+":"+nm+ " Wing has SideCar");
    }
    else{
      System.out.println( getBrand()+":"+nm+ " is doing Wheelie!!");
    }
  }
  
}