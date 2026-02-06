package Java_Solutions;
import java.util.Scanner;

public class SumOfAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int temp;
        if (a>b){
          temp=a;
          a=b;
          b=temp;
        }
        int sum=0;
        for (int i=a+1; i<b; i++){
          if (i%2==1){
            sum+=i;
          }
        }
        System.out.printf("The Sum of Odd Numbers is = %d", sum);
        
        input.close();
    }
}    
