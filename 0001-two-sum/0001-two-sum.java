public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[0];

        // Using Hash Map : 1 Pass

        HashMap<Integer, Integer> strMap = new HashMap();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if(strMap.containsKey(diff)){
                return new int[] {strMap.get(diff), i};
            }
            strMap.put(num, i);
        }
        return new int[] {};
    }
}