package day5;

import java.util.Scanner;

public class remove0 {
    public static void main(String[] args) {
        Scanner vs = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = vs.nextInt();
        int i = 0;
        int rev = 0;
        while (num != 0) {
            int pop = num % 10;
            if (pop != 0) {
                i = i * 10 + pop;
            }
            num = num / 10;}
        while (i != 0) {
            int dig = i % 10;
            rev = rev * 10 + dig;
            i = i / 10;
        }
        System.out.println(rev);
    }
}