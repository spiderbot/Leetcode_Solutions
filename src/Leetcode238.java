public class Leetcode238 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(productExceptSelf(nums));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] productOfLeft = new int[nums.length];
        int[] productOfRight = new int[nums.length];
        int[] result = new int[nums.length];
        productOfRight[nums.length - 1] = 1;
        productOfLeft[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            productOfLeft[i] = productOfLeft[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            productOfRight[i] = productOfRight[i + 1] * nums[i + 1];
        }
        for(int i=0;i<result.length;i++){
            result[i] = productOfRight[i] * productOfLeft[i];
        }
        return result;
    }


}


