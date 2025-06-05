import java.util.Scanner;
public class task1{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        
        int sum = 0;
        int max =0;
        int min = 99;
        double avg=0;
        int count=0;


         for(int i=0; i<10 ; i++){
            int num1 = sc.nextInt();
            if(num1>=0 && num1 %2 != 0){
                count++;
                sum += num1;

            
            if(num1> max){
                max =num1 ;
            }
            else if(num1< min){
                min = num1 ;
            }
         }
         }

            if(count >0){
            avg = (double)sum / count;
            }
            else{
                System.out.println("No odd positive numbers found");
        
            }
         

         System.out.println("Sum = " + sum);
         System.out.println("Minimum = " + min);
         System.out.println("Maximum = " + max);
         System.out.println("Average = " + avg);

    }
}
