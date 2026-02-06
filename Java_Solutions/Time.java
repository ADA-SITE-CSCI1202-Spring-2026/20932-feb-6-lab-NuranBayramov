package Java_Solutions;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d seconds is equivalent to: %d hours, %d minutes, and %d seconds.%n", totalSeconds, hours, minutes, seconds);
        
        input.close();
    }
}
