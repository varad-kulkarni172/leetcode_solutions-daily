public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] == nums[i - 1]){
        //         return true;
        //     }
        // }
        // return false;

        return Arrays.stream(nums).distinct().count() < nums.length; // Need to convert Arrays to streams first as Arrays is not a utility class and thus doesnt have the distinct and count methods directly
    }
}