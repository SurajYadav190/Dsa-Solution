import java.util.Scanner;

public class reverseArray {

    public int reverse(int[] arr){
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return 0;
    }
    public static void main(String[] args) {
        reverseArray obj=new reverseArray();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements of the array");
        for(int i=size-1;i>=0;i--){
            arr[i]=scanner.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println("reversed array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        int result=obj.reverse(arr);
        System.out.println("\nReversed array: " + java.util.Arrays.toString(arr));
    }
}
