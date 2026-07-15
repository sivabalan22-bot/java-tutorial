package day5;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner vs = new Scanner(System.in);
        int num = vs.nextInt();
        int ld = num%10;
        while(num>10) {
            num = num / 10;
        }
        int fd=num;
        int sum=ld+fd;
        System.out.println("result: "+sum);

        }
    }
