import java.util.Scanner;
public class task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String s1= sc.nextLine();
    String s2= sc.nextLine();
    
    String s3 = s1 + " " + s2;
    
    int sum=0;
    for(int i=0; i< s3.length(); i++){
      char chr = s3.charAt(i);
      if((chr>='A' && chr<='Z')||(chr>='a' && chr<='z')){
        sum+=(int)chr;
      }
    }
       System.out.println(s3);
    System.out.println(sum); 
    

  }
}