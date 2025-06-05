import java.util.Scanner;
public class task4{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    
    String s1= sc.nextLine();
    String newS = "";
    
    for(int i =0; i<s1.length(); i++){
      char chr = s1.charAt(i);
        if(chr=='a'){
           newS += 'z' ;
        }
          else{
        newS+= (char)(chr-1);
          }
      }
      // newS += (char)num1;
    System.out.println(newS);
  }
}

    
      
      
    
    
