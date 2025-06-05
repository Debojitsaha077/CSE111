public class Garage{
  int bike_Cap, count2=0;
  int car_Cap, count1=0;
  public Car[] cars;
  public Bike[] bikes ;
  
  public Garage(int car_Cap, int bike_Cap){
    this.car_Cap = car_Cap;
    this.bike_Cap= bike_Cap;
    this.cars= new Car[car_Cap];
    this.bikes = new Bike [bike_Cap];
    //System.out.println( );
    System.out.println( "Welcome to the Garage!\nCar Capacity: "+car_Cap+"\nBike Capacity: "+bike_Cap  );
  }
  
  public void addVehicle(Vehicle obj){
    if(obj instanceof Car){
      if(count1 < car_Cap ){
        cars[count1]= (Car)obj;
        count1++;
        System.out.println( "A "+obj.getBrand()+ " CAR has been added to the Garage");
      }
      else if(count1>= car_Cap){
        System.out.println( "Can't add more Cars! Capacity: "+car_Cap);
      }
    }
    else if(obj instanceof Bike){
      if(count2 < bike_Cap ){
        bikes[count2]= (Bike)obj;
        count2++;
        System.out.println( "A "+obj.getBrand()+ " BIKE has been added to the Garage");
      }
      else if(count2>= bike_Cap){
        System.out.println( "Can't add more Bikes! Capacity: "+bike_Cap);
      }
    }
  }
  
}

















