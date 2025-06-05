public class Passenger {
   public static int no_of_passenger=0  ;
   public static double total_fare= 0.0  ;
  private double dis;
  private double fare,kg,kgFare;
  private String name;
  
  public Passenger(String name, double dis){
    this.name= name;
    this. dis= dis;
    this.fare= dis*20;
    this.no_of_passenger++;
    total_fare+=this. fare;
  }
  
  public void storeBaggageWeight(double kg){
    this.kg = kg;
    this. kgFare=kg*10;
    this.fare += kgFare;
    total_fare+= kgFare;
  }
  
  public void passengerDetails(){
    System.out.println("Name: "+ name+"\nFare: "+ fare+" TK");
  }
}
  
  
  