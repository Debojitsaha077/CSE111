public class CellPhone {
  public String model = "unknown";
  int count=0;
  String [] arr1 = new String[3]; 
  
  public void printDetails(){
    System.out.println("Phone Model  "+ model +"\n"+"Contacts Stored  "+count);
    if(count >0){
       System.out.println("Stored Contacts: ");
      for(int i=0; i<count;i++){
 System.out.println(arr1[i] );
      }
           
    }
  }
  
  public void storeContact(String s1){
    if(count < arr1.length){
      arr1[count]= s1;
      count++;
      System.out.println("Contacts Stored " );
    }
    else{
      System.out.println("Memory full. New contact can't be stored.");
    }
  }
}
  
      
    
  
  