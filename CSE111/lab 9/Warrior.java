public class Warrior extends Character {
  public Warrior(String nm, int lvl){
    super(nm, lvl);
  }
  
  public void specialMove(){
    System.out.println(name+ " performs a heavy sword slash");
  }
}