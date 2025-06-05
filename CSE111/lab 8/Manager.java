public class Manager  extends Employee {
  double bonus;
  
  public Manager(String name, double baseSalary, int hoursWorked,double bonus){
    super(name,baseSalary,hoursWorked);
    this.bonus = bonus;
  }
  
  public void calculateSalary(){
    if(getHoursWorked()>40){
      double calcBonus = getBaseSalary()* (bonus/100.0);
      setBaseSalary(getBaseSalary() + bonus);
    }
  }
  
  public void requestIncrement(double tk){
    if(getHoursWorked()>100){
      setBaseSalary(getBaseSalary() + tk);
    }
    else if(getHoursWorked()> 80 ){
      setBaseSalary(getBaseSalary() + (tk/2));
      System.out.println("$ "+ (tk/2)+ " Increment approved." );
    }
    else{
      System.out.println("Increment denied." );
    }
  }
  
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Bonus: "+ bonus+" %");
    System.out.println("Final Salary: $"+getBaseSalary());
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
      
