public class Library {
  String name;
  int cap, num=0 ;
  String[] arr1;
  
  public void setBookCapacity(int cap){
    this.cap = cap;
    this. arr1 = new String[cap];
  }
  
  public void addBook(String name){
    this.name = name;
   
    if(cap<= num){
      System.out.println("Exceeds maximum capacity. You can't add more than "+ cap+" books");
  }
      else{
        
        this.arr1[num]= name;
        num++;
        System.out.println("Book " + name+ " added to the library");
  }
  }
  
  public void printDetail(){
    System.out.println("Maximum Capacity: "+ cap+ "\n"+"Total Books: "+ num+ "\n"+"Book list: ");
    for(int i = 0; i<num; i++){
      
       System.out.println(arr1[i]);
    }
    
  }
}
        
  