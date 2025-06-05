public class Student {
  String name, email, password, dep;
  int id,totalAdvisee=0;
  boolean log= false;            // course count // course name arr  //setter getter er bodole obj.var
  
  
  public Student (String name,int id,String dep){
    this.name=name;
    this.id=id;
    this.dep=dep;
    System.out.println("Student object is created");
    totalAdvisee++;
  }
  
  public void logStatus (boolean log){
    this.log=log;
  }
  
  public boolean getLog(){
    return log;
  }
  
  public String getName(){
    return name;
  }
  
  public String getEmail(){
    return email;
  }
  
  public String getPass(){
    return password;
  }
  
  public int getId(){
    return id;
  }
  
   public int getTotalAdvisee(){
    return totalAdvisee;
  }
  
  public String getDep(){
    return dep;
  }
}