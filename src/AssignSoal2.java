import java.util.Scanner;

public class AssignSoal2 {
    public static boolean PalindromChecker(String str) {
        // lowercasing text
        str = str.replaceAll("\\s+", "").toLowerCase();

        // membalik string
        String reversed = new StringBuilder(str).reverse().toString();

        // pembanding text asli dengan yang dibalik
        return str.equals(reversed);
    }


    public static void main(String[] args) {
        String input = "Anna";
        System.out.println("Input: " + input);
        System.out.println("Output: " + PalindromChecker(input));
    }
}
