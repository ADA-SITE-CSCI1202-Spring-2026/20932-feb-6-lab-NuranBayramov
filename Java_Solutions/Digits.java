package Java_Solutions;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int sum=0, pr=1, cnt=0;
        while (n!=0){
          sum+=n%10;
          pr*=n%10;
          cnt++;
          n/=10;
        }
        System.out.printf("The sum is %d, the product is %d, and the average is %d", sum, pr, sum/cnt);
        input.close();
    }
}
