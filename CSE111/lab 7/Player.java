public class Player extends SportsPerson {
  int goal, match, earn;
  double ratio;
  
  public Player(String team, String name, String role, int goal, int match){
    super(team,name, role);
    this. goal = goal;
    this. match = match;
  }
  
  public void calculateRatio(){
    this.earn= (goal * 1000) + (match * 10);
    this. ratio = (double)goal/ (double)match;
  }
  
  public void printDetails(){
    System.out.println(getNameTeam() +"\nTeam Role: "+ role+ "\nTotal Goal: "+goal+", Total Played: "+match+"\nGoal Ratio: "+ratio+"\nMatch Earning: "+earn+"k");
  }
}