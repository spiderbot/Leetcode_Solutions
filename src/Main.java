//import java.sql.Array;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] nums = {1,1,1,2,2,3};
//        List<Integer>[] bucket = new List[nums.length+1];
//        int k = 2;
//        int result[] = new int[k];
//        Map<Integer,Integer> countTrackerMap = new HashMap<>();
//        Arrays.stream(nums).forEach(num -> {
//            countTrackerMap.put(num, countTrackerMap.getOrDefault(num,0) + 1);
//        });
//        System.out.println(countTrackerMap);
//
//        countTrackerMap.keySet().stream().forEach(key -> {
//            int frequency = countTrackerMap.get(key);
//            if(bucket[frequency] == null){
//                bucket[frequency] = new ArrayList<>();
//            }
//            bucket[frequency].add(key);
//        });
//
//        // getting the top k elements
//        int counter = 0;
//        for(int i = bucket.length - 1; i> 0 && counter < k; i--){
//            if(bucket[i] != null){
//                for(Integer ii : bucket[i]){
//                    result[counter] = ii;
//                }
//            }
//        }
//
//        return result;
////        System.out.println(result);
//    }
//}