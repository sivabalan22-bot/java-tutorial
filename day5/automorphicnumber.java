package day5;
import java.util.*;
public class automorphicnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number:");
        int num = input.nextInt();
        int square = num * num;
        int temp = num;
        int divisor = 1;

        // Create divisor = 10, 100, 1000, ...
        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }
        if (square % divisor == num) {

            System.out.println("Automorphic");
        } else {
            System.out.println("not Automorphic");
        }
    }
}