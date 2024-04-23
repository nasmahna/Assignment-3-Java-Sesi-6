public class AssignSoal2Ver2 {
    public static boolean cekPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        String input = "Titot";
        System.out.println("Input: " + input);
        System.out.println("Output: " + cekPalindrome(input));
    }
}
