import java.util.*;
public class findmissingnumber {
public int findMissing(int[] arr) {
    int n = arr.length + 1; 
    int totalSum = n * (n + 1) / 2;
    int arraySum = 0;
    for (int num : arr) {
        arraySum += num;
    }
    return totalSum - arraySum;
}


    public static void main(String[] args) {
        findmissingnumber obj=new findmissingnumber();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=scanner.nextInt();
        int[] arr=new int[size];    
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){    
            arr[i]=scanner.nextInt();
        }   
        int missingNumber = obj.findMissing(arr);
        System.out.println("The missing number is: " + missingNumber);  
    }
}
