package day5;
import java.sql.SQLOutput;
import java.util.*;
public class function {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int c=add(num1, num2);
        System.out.println(c);

    }

    public static int add(int num1,int num2){
        return num1+num2;
    }

    public static void add1(int num1,int num2)
    {
        System.out.println("hello");
    }

    public static void  add2(int num1,int num2 )
    {
        System.out.println(num1+num2);
    }

    public static int add3() {
        return 1;
    }
}