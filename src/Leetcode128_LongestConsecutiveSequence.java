import java.util.Arrays;

public class Leetcode128_LongestConsecutiveSequence {

    public static void main(String[] args) {
       int[] nums =  {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1 && nums[0] == 0){
            return 1;
        }
        int maxElement = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > maxElement){
                maxElement = nums[i];
            }
        }
        System.out.println(maxElement);
        int[] trackerArray = new int[maxElement+1];
        trackerArray[0] = 0;
        Arrays.stream(nums).forEach(num -> {
//            if(num != 0){
                trackerArray[num] = 1;
//            }
        });


        int longestLength = 0;
        int longestLengthSoFar = 0;
        if(trackerArray[0] == 1){
            longestLength++;
            longestLengthSoFar = longestLength;
        }
//        for(int i=1;i<trackerArray.length;i++){
//            if(trackerArray[i] == 0){
//                longestLength = 0;
//            }
//            if(trackerArray[i] == 1 && trackerArray[i-1] == 1 && trackerArray[i+1] == 1){
//                longestLength = longestLength + 2;
//                i = i+2;
//            }
//            if(trackerArray[i] == 1 && trackerArray[i-1] == 0 && trackerArray[i+1] == 0){
//                longestLength = 1;
//            }
//            if(trackerArray[i] == 1 && trackerArray[i-1] == 1 && trackerArray[i+1] == 0){
//                longestLength++;
//            }
//            if(trackerArray[i] == 1 && trackerArray[i-1] == 0 && trackerArray[i+1] == 1){
//                longestLength++;
//            }
//            if(longestLength > longestLengthSoFar) {
//                longestLengthSoFar = longestLength;
//            }
//
//        }
        for(int i=1;i<trackerArray.length;i++){
            if(trackerArray[i] == 1 && trackerArray[i-1] == 1){
                longestLength++;
            }else if(trackerArray[i] == 0 && trackerArray[i-1] == 1){
                longestLength = 0;
            }else if(trackerArray[i] == 1 && trackerArray[i-1] == 0){
                longestLength = 1;
            }
            if(longestLength > longestLengthSoFar){
                longestLengthSoFar = longestLength;
            }

        }
        return longestLengthSoFar;
    }



    }


