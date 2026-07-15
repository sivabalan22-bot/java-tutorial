package day5;
import java.sql.SQLOutput;
import java.util.*;
public class evenorodd{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:");
        int a= input.nextInt();
        int sum=0;
        int evensum=0;
        int oddsum=0;
        while(a!=0){
            int pop=a%10;
            if(pop%2==0){
                evensum+=pop;
            }
            else{
                oddsum+=pop;
            }

            sum+=pop;
            a/=10;
        }
        System.out.println(evensum);
        System.out.println(oddsum);
        System.out.println(sum);
    }
}