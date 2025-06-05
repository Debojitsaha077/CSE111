public class Shape2D {
  String shape;
  int len= 5,hei,base,breadth;
  double ar ;
  
  
  public Shape2D (){
    shape= "Square";
    System.out.println("A "+shape+" has been created with "+"\nlength: "+len);
  }
  
  public Shape2D (int hei , int base, String shape){
    this.shape = shape;
    this.hei = hei;
    this.base = base;
    System.out.println("A "+shape+" has been created with "+"\nheight: "+hei+" and base:"+base);
  }
  
  public Shape2D  (int len , int breadth){
    this.len = len;
    this.breadth = breadth;
    shape= "Rectangle";
    System.out.println("A Rectangle has been created with "+"\nlength: "+len+" and breadth:"+breadth);
  }
  
  public Shape2D (int hei , int base, int len){
    this.hei = hei;
    this.base = base;
    this.len = len;
    shape= "triangle";
    System.out.println("A Triangle has been created with"+"\nthe following sides: "+hei+","+base+","+len);
  }
  
  public void area(){
    if(shape.equals("Square")){
      ar = len*len;
    }
    else if(shape.equals("Triangle")){
      ar = 0.5* hei*base;
    }
    else if(shape.equals("Rectangle")){
      ar = len*breadth;
    }
    else if(shape.equals("triangle")){
      double s=(hei+base+len)/2;
      ar= Math.sqrt(s*(s-hei)*(s-base)*(s-len));
    }
    
    //this. ar = ar;
    System.out.println("The area of the "+shape+" is: "+ar);
  }
}
