public class Dog extends Animal{
    String name,sound= "Not defined";
    public Dog(){
      System.out.println("The dog says hello!");
}

    public String getName(){
      return name;
}
    
    public void details(){
      System.out.println("Legs: "+legs+"\nSound: "+ sound);
}
    
    public void updateSound(String sound){
      this.sound = sound;
    }
}
      