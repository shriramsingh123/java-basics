package stream.employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       for (int i=0;i<nums.length;i++){
           int complement = target-nums[i];
           if (map.containsKey(complement)){
               return new int[]{map.get(complement),i};
           }
           map.put(nums[i],i);
       }
       return new int[0];
    }


    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));  // Output: [0, 1]


        System.out.println("\n Terminated Successfully");
    }
}
