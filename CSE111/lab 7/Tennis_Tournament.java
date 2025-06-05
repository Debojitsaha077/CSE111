public class Tennis_Tournament extends Tournament {
  int player;
  
  public Tennis_Tournament (String name, int player){
    super(name);
    this.player=player;
  }
  
  public String detail(){
    return "Tennis Tournament Name: "+ getName()+"\nNumber of Players: "+player;
  }
}