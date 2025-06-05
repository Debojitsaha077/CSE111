public class CustomerService {
  int cap,served=0,count=0;
  //String name;
  String[] arr;
  
  
  
  public CustomerService(int cap){
    this.cap =cap;
    this.arr= new String[cap];
  }
  
  public void addCustomer(String name){
    //this.name= name;
    
    if(count<cap ){
      arr[count]= name;
      count++;
      System.out.println("Added: "+ name);
    }
    else{
      System.out.println("Queue is full. Cannot add "+ name);
    }
  }
  
  public void serveCustomer(){;
    if(served<count ){    
        System.out.println("Serving : "+ arr[served]);
        served++;
        count--;
      }
    
    
    else {  
      System.out.println("No customers to serve");
    }
    
  }
}