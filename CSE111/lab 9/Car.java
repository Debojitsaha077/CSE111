public class Car extends Vehicle{
  String nm ;
  int door, wh;
  boolean status;
  
  public Car(String com, String nm , int yr, int door, int wh, boolean status){
    super(com, yr);
    setWheels(3);
    this.nm=nm;
    this.door=door;
    this.wh=wh;
    this.status=status;
    //System.out.println( );
  }
  
  public String toString(){
    System.out.print("Car " );
    
    return super.toString()+ " Model: "+ nm+ ", Doors: "+ door+ ", AI: "+ status;
  }
  
  public void startAutoPilot(){
    if(!status){
      System.out.println( getBrand()+":"+nm+ " has NO AutoPilot");
    }
    else{
      System.out.println( getBrand()+":"+nm+ " AutoPilot Started");
    }
  }
  
}

