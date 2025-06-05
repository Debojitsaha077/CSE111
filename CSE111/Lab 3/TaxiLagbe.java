public class TaxiLagbe {
  String name1, name2, city, num;
  int tk,tk2,tk3, count=0;
  String[] arr1=new String[4]; ;
  
  public void storeInfo(String num, String city){
    this. num = num;
    this. city = city;
  }
  
  public void addPassenger(String name1, int tk){
    this. name1 = name1;
    this. tk = tk;
    
    if(count<arr1.length){
      this.arr1[count]= name1;
      //this.arr1[i]= name2;
      count++;
      System.out.println("Dear "+ name1+ "! Welcome to TaxiLagbe" );
    }
    else{
      System.out.println("Taxi Full! No more passengers can be added");
    }
    
    
  }
  
  public void addPassenger(String name1, int tk3,String name2, int tk2){
    this. name1 = name1;
    this. tk3 = tk3;
    this. name2 = name2;
    this. tk2 = tk2;
    
    if(count<arr1.length){
      this.arr1[count]= name1;
      count++;
      this.arr1[count]= name2;
      count++;
      
      System.out.println("Dear "+ name1+ "! Welcome to TaxiLagbe" );
      System.out.println("Dear "+ name2+ "! Welcome to TaxiLagbe" );
    }
    else{
      System.out.println("Taxi Full! No more passengers can be added");
    }
  }
  
  public void printDetails(){
    System.out.println("Taxi number: "+ num+ "\n!This taxi can cover "+ city+ " area"+"\nTotal Passenger: "+ count+"\nPassenger Lists: " );
    
    for(int i=0; i<count; i++){
      System.out.print(arr1[i]+" ");
    }
    System.out.println("\nTotal collected fare:  "+(tk+tk2+tk3)+ " Taka");
  }
}

















