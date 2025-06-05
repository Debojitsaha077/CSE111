public class ComplexNumber extends RealNumber {
  double iPart= 1.0;
  
  public ComplexNumber(double realValue, double iPart){
    super(realValue);
    
    this. iPart= iPart;
  }
  
  public String toString(){
    return "RealPart: " + realValue+ "\nImaginaryPart: "+ iPart;
  }


 public ComplexNumber(){
    super(1.0);
    this. iPart= iPart;
  }
}