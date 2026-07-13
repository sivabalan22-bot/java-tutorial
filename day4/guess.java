package day4;

import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int key = rand.nextInt(100) + 1; // 1 to 100
        int guess;

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess > key) {
                System.out.println("Guess is too high");
            } else if (guess < key) {
                System.out.println("Guess is too low");
            } else {
                System.out.println(" You guessed it!");
            }

        } while (guess != key);

        input.close();
    }
}