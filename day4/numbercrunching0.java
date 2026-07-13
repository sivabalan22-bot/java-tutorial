import java.util.Scanner;

public class numbercrunching0 {
    public static void main(String[] args){
        Scanner vs = new Scanner(System.in);
        int num = vs.nextInt();
        while(num!=0){
            int pop=num%10;
            num=num/10;
            if(pop==0){
                System.out.println("my number contains zero");
                break;
            }

        }

    }
}