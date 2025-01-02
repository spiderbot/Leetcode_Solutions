import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode442_FindAllDuplicatesInArray {

    public static void main(String[] args) {
       int[] nums =  {4,3,2,7,8,2,3,1};
       System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if(nums.length == 0 || nums.length == 1){
            return result;
        }
        for(int i=0;i<nums.length;i++){
            int indexToBeChecked = Math.abs(nums[i])-1;
            int valueAtIndexToBeChecked = nums[indexToBeChecked];
            if(valueAtIndexToBeChecked < 0){
                result.add(Math.abs(nums[i]));
            }else{
                nums[indexToBeChecked] = (-1)* nums[indexToBeChecked];
            }
        }
        return result;
    }



    }


