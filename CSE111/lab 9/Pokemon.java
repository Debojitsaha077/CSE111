public class Pokemon {
  
  String name;
  
  public Pokemon (String nm){
    name = nm;
    System.out.println(name+ " attacks with a basic move!");
  }
  
  public void attack(String at){
    System.out.println(name+ " uses "+ at+"!");
  }
  
    public void attack(){
  }
  
  public void attack(String at, int pw){
    System.out.println(name+ " uses "+ at+ "with power "+ pw+"!");
  }
}