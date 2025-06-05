public class Reader {
  String name="New user", book;
  int cap=0,count=0;
  String[] arr1;
  
  public String createReader(String name, int cap){
    this. name = name;
    this. cap = cap;
    this. arr1 = new String[cap];
    return "A new reader is created!";
  }
  
  public void readerInfo(){
    //if(count<cap){
    System.out.println("Name: "+name+"\nCapacity: "+cap+"\nBooks: ");
    
    if(count>0){
      for(int i = 0; i<count; i++){
        System.out.println("Book "+ (i+1)+ " : "+arr1[i]);
      }
    }
    
    else{
      System.out.println("No books added yet");
    }
  }
   
  public void addBook(String book){
    this.book = book;
    if(count<cap){
      arr1[count]= book;
      count++;
    }
    else{
      System.out.println("No more capacity");
    }
  }
}