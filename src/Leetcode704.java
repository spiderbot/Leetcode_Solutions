public class Leetcode704 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,5};
        System.out.println(search(nums,-1));


    }

    public static int search(int[] nums,int target) {
        if(nums.length == 0){
            return -1;
        }
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                low = mid +1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
}
