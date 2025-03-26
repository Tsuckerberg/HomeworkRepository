import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 100 + 1; i++) {
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи слово");
        String s = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.println(isPolindrome(s) ? "Это полидромное слово" : "Это не полидромное слово");
    }

    public static boolean isPolindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) return false;
        }
        return true;
    }
}