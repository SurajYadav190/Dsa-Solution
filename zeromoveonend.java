import java.util.*;

public class zeromoveonend {
    public void moveZeroes(int[] arr) {
        int Index = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[Index] = arr[i];
                Index++;
            }
        }
        for (int i = Index; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        zeromoveonend obj=new zeromoveonend();
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements of the array");  
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        obj.moveZeroes(arr);
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
        scanner.close();    
    }
    
}
