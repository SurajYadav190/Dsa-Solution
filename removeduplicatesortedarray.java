import java.util.*;
public class removeduplicatesortedarray {

    public void removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return; 
        }
        int index = 1; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
            
        }
    }
    public static void main(String[] args) {
        removeduplicatesortedarray obj=new removeduplicatesortedarray();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        obj.removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
        scanner.close();

    }
    
}
