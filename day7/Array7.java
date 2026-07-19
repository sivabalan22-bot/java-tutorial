package day7;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args){
        Scanner v = new Scanner(System.in);
        int[] id = {1,4,5,7,80,200,2090};
        int evenSum=0;
        int oddSum=0;
        for(int num:id){
            int org = num;
            int count = 0;
            while(num!=0){
                count++;
                num/=10;
            }
            if(count%2==0){
                evenSum+=org;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);


    }
}