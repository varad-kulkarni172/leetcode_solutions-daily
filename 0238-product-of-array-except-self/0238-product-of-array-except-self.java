public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pref = new int[n]; // array pref that can hold n integers
        int[] post = new int[n];

        pref[0] = 1;
        post[n - 1] = 1;

        for(int i = 1; i < n; i++){
            pref[i] = nums[i - 1] * pref[i - 1];
        }

        for(int i = n - 2; i >= 0; i--){
            post[i] = nums[i + 1] * post[i + 1];
        }

        for(int i = 0; i < n; i++){
            res[i] = pref[i] * post[i];
        }
        
        return res;
    }
}