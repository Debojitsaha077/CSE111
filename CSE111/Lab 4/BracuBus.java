public class BracuBus {
  
  String loc;
  int count=0, cap=2;
  BracuStudent[] arr1;
  
  public BracuBus(String loc){ 
    this.loc = loc;
    this. arr1= new BracuStudent[cap];
  }
  
  public BracuBus(String loc, int cap){ 
    this.loc = loc;
    this.cap = cap;
    this. arr1= new BracuStudent[cap];
  }
  public void showDetails(){
    System.out.println("Bus Route: "+ loc+"\nPassenger Count: "+count+"(Max: "+cap+")\nPassengers on Board: ");
    for(int i=0; i<count; i++){
      System.out.print(arr1[i].name+" ");
    }
  }
  
  public void board(){ 
    System.out.println("No passengers");
  }
  
  public void board(BracuStudent obj1,BracuStudent obj2){
    board(obj1);
    board(obj2);
  }
  
  
  public void board(BracuStudent obj){
    if(cap<=count){
      System.out.println("Bus is full!.");
    }
    else if(!obj.status){
      System.out.println("You don't have a bus pass!");
    }
    else if(loc!=obj.home){
      System.out.println("You got on the wrong bus!");
    }
    else{
      arr1[count]=obj;
      count++;
      System.out.println(obj.name+" boarded the bus.");
    }
  }
}

     
    
  