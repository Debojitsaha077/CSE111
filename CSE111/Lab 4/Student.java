public class Student {
  String name, prog;
    
   public Student(String name , String prog){
    this. name= name;
    this. prog= prog;
  }
  
  public void updateName(String name){
    this. name= name;
  }
    public void updateProgram(String prog){
    this. prog= prog;
  }
    
    public String accessProgram(){
      return prog ;
  }
}