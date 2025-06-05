public class Paladin  extends Warrior {
  public Paladin(String nm, int lvl){
    super(nm, lvl);
  }
  
  public void specialMove(){
    System.out.println(name+ " unleashes a holy strike!");
  }
}