public class KKFlavouredTea extends KKTea{
  
  String name;
  
  public KKFlavouredTea(String name, int pc, int num2){
    super( pc, num2 );
    this.name = name;
  }
  
  public static void updateSoldStatusFlavoured(KKFlavouredTea ob){
    if(!(ob.status)){
      sell++;
      sellF++;
      ob.status= true;
    }
  }

  public  static void totalSales(){
    System.out.println("Total Sales: "+sell+ "\nKK Regular Tea: "+ sellR);
    System.out.println("KK Flavoured Tea: "+sellF);
  }
  
}


