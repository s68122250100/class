import java.util.Random;
import java.util.Scanner;

public class Gama1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int answer = new Random().nextInt(20) + 1;
            
            System.out.println("Guess a number (1-20). You have 5 tries.");
            
            for (int i = 1; i <= 5; i++) {
                System.out.print("Try " + i + ": ");
                int guess = sc.nextInt();
                
                if (guess == answer) {
                    System.out.println("Correct!");
                    break;
                }
                System.out.println(guess < answer ? "Too low" : "Too high");
                
                if (i == 5)
                    System.out.println("Answer is " + answer);
            }
        }
    }
}
 
