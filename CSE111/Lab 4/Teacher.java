public class Teacher {
  String name, ini;
  int count=0;
  String[] arr1 = new String[3];
  
  public Teacher(String name, String ini){
    this. name = name;
    this. ini = ini;
    System.out.println("A new teacher has been created");
  }
  
    public void addCourse(Course obj ){
    arr1[count]= obj.course;
    count++;
  }
  
  public void printDetail(){
    System.out.println("Name: "+name+"\nInitial: "+ini+"\nList of courses: ");
    for(int i=0;i<count; i++){
      System.out.println(arr1[i]);
    }
  }
}
  
  