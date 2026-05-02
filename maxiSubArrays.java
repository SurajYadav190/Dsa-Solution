public class maxiSubArrays {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

     for (int i = 1; i < nums.length; i++) {
            if(currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }   
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        maxiSubArrays obj = new maxiSubArrays();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result = obj.maxSubArray(arr);
        System.out.println("Maximum subarray sum: " + result);
        
    }
}
