import java.util.Scanner;
import java.util.Arrays;

public class task7{
  public static void main(String[]args){
    Scanner sc= new Scanner (System.in);
    
    System.out.println("N=  ");
    int size= sc.nextInt();
    double arr1[] = new double [size];
    
    System.out.println("Please enter the elements of the array: ");
    for(int i= 0; i<size; i++){
      arr1[i] = sc.nextDouble();
    }
    
    double[] arr2 = new double[5];
    int count =0;
    int newS= 0;
    
    for(int i= 0; i<size; i++){
        if(i==0||arr1[i]!= arr1[i-1]){
          arr2[newS++] = arr1[i];
          
        }
        else{
          count++;
        }
      }
    System.out.println("New Array: "+ Arrays.toString(arr2));
    System.out.println("Removed elements : " + count);
  }
}

    
    