import java.util.Arrays;

public class application {
    public static void main(String[] args) {
        int[] arr = {100, 27, 30, 44, 5};
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.err.println(arr[4]);

        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Index of 30: " + index);

    }
}
