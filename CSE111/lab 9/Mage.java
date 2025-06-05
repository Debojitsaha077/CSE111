public class Mage extends Character {
  public Mage(String nm, int lvl){
    super(nm, lvl);
  }
  
  public void specialMove(){
    System.out.println(name+ " casts a powerful fireball!");
  }
}