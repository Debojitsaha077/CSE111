public class Character {
  public String name;
  public int level;
  
  public Character(String name, int level) {
    this.name = name;
    this.level = level;
  }
  
  public void specialMove() {
    System.out.println("Character uses a generic move.");
  }
  
  public boolean equals(Object obj){   
    Character o = (Character)obj;
      return this.name== o.name && this.level== o.level;
    }
  }
  
