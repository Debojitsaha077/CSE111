public class Cricket_Tournament extends Tournament {
 String type;
 int num;
 
  public String detail(){
    return"Cricket Tournament Name: "+ getName()+"\nNumber of Teams: "+num+"\nType: "+ type;
  }
  
  public Cricket_Tournament (){
    super();
    this.num=0;
    this. type= "No type";
  }
  
  public Cricket_Tournament (String name, int num, String type){
    super(name);
    this.num=num;
    this. type= type;
  }
}
  
  
    