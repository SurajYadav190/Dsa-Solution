import java.util.*;
public class checksortedarrary {

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        checksortedarrary obj=new checksortedarrary();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];  
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        boolean result = obj.isSorted(arr);
        if (result) {
            System.out.println("The array is sorted in non-decreasing order.");
        } else {
            System.out.println("The array is not sorted in non-decreasing order.");
        }
    }

}
