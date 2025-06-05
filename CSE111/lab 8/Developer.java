public class Developer extends Employee {
  String lan;
  
  public Developer(String name, double baseSalary, int hoursWorked, String lan){
    super(name,baseSalary,hoursWorked);
    this.lan = lan;
  }
  
  public void calculateSalary(){
    if(lan== "Java" ){
      setBaseSalary(getBaseSalary()+700);
    }
  }
  
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Language: "+ lan+"\nFinal Salary: $"+getBaseSalary() );
  }
}
    