public class Leetcode26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }


    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]==nums[i-1]){
                continue;

            }
            else{
                nums[j++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + "->");

        }
        return j;

    }
}


