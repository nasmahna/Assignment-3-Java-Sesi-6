public class AssignSoal1 {
    public static String sortNumber(int number){
        if (number % 2 == 0) {
            return "genap";
        } else {
            return "ganjil";
        }
    }

    public static void main(String[] args) {
        int input = 5;
        System.out.println("Input: " + input);
        System.out.println("Output: \"" + sortNumber(input) + "\"");
    }
}
