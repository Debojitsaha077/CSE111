public class BrowserHistory {
  public static int count=0;
  int cap;
  String[] web ;
  
  
  public BrowserHistory (int cap){
    this.cap = cap;
    this. web = new String[cap];
  }
  
  public void visitWeb(String site){
    if(cap>count){
      web[count]=site;
      count ++;
      
      System.out.println("Visited: "+site);
    }
    else{
       System.out.println("History is full. Cannot visit "+ site);
    }
  }
  
  public void showHistory(){
    if(count>0){
      System.out.println("Browser History: ");
      for(int i=0;i<count;i++){
        System.out.println(web[i]);
      }
    }
    else{
      System.out.println("No web pages visited yet.");
    }
  }
  
  public void currentWeb(){
    if(count>0){
      System.out.println("Current web page: "+web[count-1]);
    }
    else{
      System.out.println("You have not visited any website yet!");
    }
  }
  
  public void back(){
    count--;
  }
}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      