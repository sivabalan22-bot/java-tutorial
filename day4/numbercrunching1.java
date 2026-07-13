import java.util.Scanner;

public class numbercrunching1 {
    public static void main(String[] args) {
        Scanner vs = new Scanner(System.in);
        int num = vs.nextInt();
        int key=vs.nextInt();
        int count = 0;
        while (num!=0){
            int pop = num%10;
            if (pop==key) {
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}

