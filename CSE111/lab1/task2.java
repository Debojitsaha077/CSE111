import java.util.Scanner;

public class task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int upperVal,lowerVal;
    
    if(num1>num2){
      upperVal= num1 ;
      lowerVal= num2;
    }
    else{
      upperVal=num2;
      lowerVal=num1;
    }
    
    int count =0;
    for(int j=lowerVal; j<=upperVal; j++ ){
      if(primeCheck(j)){
        count++;
      }
    }
    System.out.println("There are "+count+ " prime numbers between"+ lowerVal+ " and"+upperVal );
  }
  public static boolean primeCheck(int num){
    if(num<=1){
      return false;
    }
    for(int i=2; i*i<=num; i++){
      if(num% i ==0){
        return false;
      }
    }
    return true;
  }
}
