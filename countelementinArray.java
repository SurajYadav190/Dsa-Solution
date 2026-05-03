import java.util.Scanner;

public class countelementinArray {

    public int countelement(int[] arr, int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        countelementinArray obj=new countelementinArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENetr the size of the array");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("enter the target element to count");
        int target=scanner.nextInt();   
        int result=obj.countelement(arr,target);
        System.out.println("the count of the target element in the array is: "+result);

    }
}
