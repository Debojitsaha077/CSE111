public class Shape{
  public String name;
  public int dia, len, wid;
  public double rec1, rec2, area;
  
  public void setParameters(String name, int dia){
    this.name = name;
    this .dia =dia;
    double area = 3.1416 * dia * dia;
    this.area = area;
  }
  
  public void setParameters(String name, int len , int wid){
    this.name = name;
    this.len = len;
    this.wid = wid;
    double area = .5 * wid* len;
    this. area  = area;
  }
  
  public void setParameters(String name, double rec1 , double rec2){
    this.name = name;
    this.rec1 = rec1;
    this.rec2 = rec2;
    double area = rec2* rec1;
    this. area  = area;
  }
  
  public String details (){
    return "Shape Name: "+ name + "\n"+ "Area: "+ area;
  }
}