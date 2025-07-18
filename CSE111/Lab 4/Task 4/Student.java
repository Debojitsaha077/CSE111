public class Student{
  int count =0, id;
  double cg = 0.0;
  String course;
  String[] courses = new String[4];
  
  public Student (int id){
    this.id = id;
    System.out.println("A student with ID "+id+ " has been created.");
  }
  
  public Student(int id, double cg){
    this.id = id;
    this.cg =cg;
    System.out.println("A student with ID "+id+ " and cgpa "+cg+" has been created.");
  }
  
  public void addCourse(String course){
    //this.course = course;
    
    if(cg<= 0.0){
      System.out.println("Failed to add "+course+ "\nSet CG first");
    }
    else if(cg<3.0 && count>03){
      System.out.println("Failed to add "+course+ "\nCG is low. Can't add more than 3 courses.");
    }
    else if(count <4) {
      courses[count]=course;
      count++;
      String[] courses = new String[count];
    }
    else{
      System.out.println("Failed to add "+course+ "\nMaximum 4 courses allowed.");
    }
  }
  
  public void addCourse(String[]courses2){   
    
    if(courses.length>4){
      System.out.println("Failed to add courses . \nMaximum 4 courses allowed.");
    }
    
    else {
      for(int i=0;i<courses2.length;i++){
        String course = courses2[i];
        addCourse(course);
      }
    }
    
  }
  
  public void storeCG(double cg){
    this.cg = cg;
  }
  
  public void storeID(int id){
    this.id = id;
  }
  
  public void removeAllCourse(){
    this.count= 0;
    this.courses = new String[4];
  }
  
  
  public void showAdvisee(){
    System.out.println("Student ID: "+ id + ", CGPA: "+cg);
    if(count==0){
      System.out.println("No courses added");
    }
    else{
      System.out.println("Added courses are: ");
      for(int i=0; i< count; i++){
        System.out.print(courses[i]+ " ");
      }
      
      System.out.print("\n");
    }
  }
}



