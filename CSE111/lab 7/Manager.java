public class Manager extends SportsPerson {
  int match_win, earn;
  
  public Manager (String team, String name, String role, int match_win){
    super(team,name, role);
    this. match_win = match_win;
    this.earn= (match_win * 1000);
  }
  
  
  public void printDetails(){
    System.out.println(getNameTeam() +"\nTeam Role: "+ role+ "\nTotal Win: "+match_win+"\nMatch Earning: "+earn+"k");
  }
}