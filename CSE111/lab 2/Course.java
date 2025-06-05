public class Course {
  
  public String course;
  public String code;
  public int credit;
  
  public void updateDetails(String course,String code,int credit){
    this.course = course;
    this.code = code;
    this.credit = credit;
  }
    
    public void displayCourse (){
    System.out.println("Course Name: "+ course +"\n"+"Course Code: "+code+"\n"+"Course Credit: "+ credit);
  }
}

    
      
  