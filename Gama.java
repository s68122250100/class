import java.util.Random;
import java.util.Scanner;

public class Gama {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner  = new Scanner(System.in);

        // สุ่ม 1 ถึง 20
        int answer = random.nextInt(20) + 1;

        System.out.println("Number guessing game");
        System.out.println("Program to randomize numbers between 1 - 20");
        System.out.println("You have 5 chances to guess.");

        // ทาย 5 ครั้ง
        for (int i = 1; i <= 5; i++) {
            System.out.print("The time " + i + " Please enter your guessed number.: ");
            int guess = scanner .nextInt();

            if (guess < answer) {
                System.out.println("too little");
            } else if (guess > answer) {
                System.out.println("too much");
            } else {
                System.out.println("Congratulations! You guessed correctly.");
                break;
            }

            //ทายครบ 5 ครั้ง ไม่ถูก
            if (i == 5) {
                System.out.println("You have made 5 guesses already.");
                System.out.println("The correct answer is " + answer);
            }
        }
    }
}
