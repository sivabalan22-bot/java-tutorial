package day8;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner vs = new Scanner(System.in);
        int n = vs.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = vs.nextInt();
        }
        int target = vs.nextInt();
        System.out.println(Linear_search(arr, target));
    }
    static int Linear_search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}