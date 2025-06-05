public class KKTea extends Tea{
  int weight, pr, num; 
  public static int sell=0, sellR=0, sellF=0;
  
  public  KKTea (int pr, int num){
    super("KK Regular Tea", pr);
        this.num = num;
  }
  
  public void productDetail(){
    super.productDetail();
    System.out.println("Weight: "+(num*2)+", Tea Bags: "+ num);
  }
  
  public  static void totalSales(){
    System.out.println("Total Sales: "+sell+ "\nKK Regular Tea: "+ sellR);
  }
  
  public static void updateSoldStatusRegular(KKTea obj){
    if(!(obj.status)){
    sell++;
    sellR++;
   obj.status= true;
  }
}
}
  