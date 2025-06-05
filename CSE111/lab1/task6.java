import java.util.Scanner;
import java.util.Arrays;

public class task6{
  public static void main(String[]args){
    Scanner sc= new Scanner (System.in);
    
    System.out.println("N=  ");
    int size= sc.nextInt();
    int arr1[] = new int [size];
    
    for(int i= 0; i<size; i++){
      arr1[i] = sc.nextInt();
    }
    
    
    for(int i= 0; i<size; i++){
      int count = 1;
      for(int j=i+1; j< size ; j++){
        if(arr1[i]== arr1[j]){
          count++;
        }
        else{
          continue;
        }
      }
      System.out.println(arr1[i]+"-"+ count + "times");
    }
  }
}


