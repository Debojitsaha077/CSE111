public class BracuStudent {
  String name, loc,home;
    int cap,count=0;
    boolean status;
    
    public BracuStudent (String name, String home){
      this. name= name;
      this. home =home;
      this. status = false ;
        
    }
    
    public void showDetails(){
      System.out.println("Student Name: "+name+"\nLives in "+home+"\nHave Bus Pass? "+ status);
      }

    
    public void getPass(){
      this.status= true ;
    }

    
    public void updateHome(String home){
      this.home= home ;
    }
}    