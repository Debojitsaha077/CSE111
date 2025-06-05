public class Circle {
  public static int count=0;
  
  private  int rad;
  private  double radius,area;
  
  public Circle(int rad){
    this.rad= rad;
    setRadius();
    count++;
  }
  
  public void setRadius() {
   this.radius= this.rad* 1.0;
  }
  
  public double getRadius() {
    return radius;
  }
  
  public double area() {
    this.area= Math.PI*radius*radius ;
    return area;
  }
}
  