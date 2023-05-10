import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        // Multiply each element in the array by 2
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

        System.out.println(Arrays.toString(array)); // Output: [2, 4, 6, 8, 10]

    }
}
