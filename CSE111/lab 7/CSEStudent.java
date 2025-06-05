public class CSEStudent extends Student {
  public static int studentCount=0;
  public static String[] labcourses = {"CSE110", "CSE111", "CSE220", "CSE221" };
  
  public static void details(){
    System.out.println("Total CSE Students: "+studentCount+"\nAvailable Lab Based Courses: ");
    for(String i : labcourses){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  
  public CSEStudent(String name, int id){
    super(name, id);
    studentCount++;
  }
  
  public void addLabBasedCourse(String course){
    boolean status= false;
    for(String i : labcourses){
      if(i.equals(course)){
        status= true;
      }
    }
    if (status){
      courses+= " "+course+ " ";
    }
      else{
        System.out.println("It is not a lab based course!");
      }
    }
  }


  