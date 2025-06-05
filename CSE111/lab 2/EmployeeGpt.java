//public class Employee {
//    public String name;
//    public double salary = 30000.0;
//    public String des = "junior";
//    public double nSalary;
//
//    public void newEmployee(String name) {
//        this.name = name;
//    }
//
//    public void displayInfo() {
//        System.out.println("Employee Name: " + name + "\n" + "Employee Designation: " + des);
//        
//        if (des.equals("junior")) {
//            System.out.println("Employee Salary: " + salary + " Tk " + "\n");
//        } else {
//            System.out.println("Employee Salary: " + nSalary + " Tk " + "\n");
//        }
//    }
//
//    public void calculateTax() {
//        if (salary <= 30000.0) {
//            System.out.println("No need to pay tax");
//        } else if (nSalary > 30000.0 && nSalary < 50000.0) {
//            System.out.println(name + " Tax Amount: " + nSalary * 0.1 + " Tk");
//        } else if (nSalary >= 50000.0) {
//            System.out.println(name + " Tax Amount: " + nSalary * 0.3 + " Tk");
//        }
//    }
//
//    public void promoteEmployee(String des) {
//        this.des = des;
//        System.out.println(name + " has been promoted to " + des);
//        
//        if (des.equals("senior")) {
//            nSalary = 30000.0 + 25000.00;
//            System.out.println("New Salary: " + nSalary + " Tk");
//        } else if (des.equals("lead")) {
//            nSalary = 30000.00 + 50000.00;
//            System.out.println("New Salary: " + nSalary + " Tk");
//        } else if (des.equals("manager")) {
//            nSalary = 30000.00 + 75000.00;
//            System.out.println("New Salary: " + nSalary + " Tk");
//        }
//    }
//}