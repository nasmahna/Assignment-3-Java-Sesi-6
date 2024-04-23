import java.util.Arrays;

public class AssignSoal3 {
    public static int arrMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1]; //kembalian: urutan secara ascending
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 15, 31};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Angka Terbesar: " + arrMax(array));
    }
}