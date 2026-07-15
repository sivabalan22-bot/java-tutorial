package day5;

import java.util.*;
public class armstrong {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a three digit value:");
        int a=input.nextInt();
        int org=a;
        int sum=0;
        while(a!=0)
        {
            int pop=a%10;
            sum+=pop*pop*pop;
            a=a/10;
        }
        if(sum==org) {
            System.out.println("the given number is armstrong");
        }
        else
        {
            System.out.println("the given number is not a armstrong number");
        }



    }

}