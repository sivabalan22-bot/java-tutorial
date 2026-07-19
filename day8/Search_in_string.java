package day8;

public class Search_in_string {
    public static void main(String[] args) {
        String name = "hello world";
        char[] name1 = name.toCharArray();
        char target = 'd';

        if (ls(name1, target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
    static boolean ls(char[] arr, char target) {
        for (char ch : arr) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}