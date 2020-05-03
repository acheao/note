package leetcode;

import java.util.HashMap;

public class TwoSum {
	
	public int[] twoSumOne(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
	
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
	    if(nums.length>=2){
	        for(int i=0;i<nums.length;i++){
	            for(int j=0;j<nums.length;j++){
	                if(i != j && nums[i]+nums[j]==target){
	                    res[0] = i;
	                    res[1] = j;
	                }
	            }
	        }
	        
	    }
	    return res;
	}
	
	public int[] twoSumAnother(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if(map.containsKey(target - nums[i])){
               res[0] = i;
               res[1] = map.get(target-nums[i]);
               break;
           }
           map.put(nums[i], i);
        }
        return res;
	}
	 
}
