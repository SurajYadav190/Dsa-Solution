public class LargeElement {

    public  int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        LargeElement obj=new LargeElement();
        int[] arr = {1,43, 55, 74, 29};
        int largest =obj.findLargest(arr);
        System.out.println("Largest element in the array: " + largest);
    }
}
