class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int outcome = 0;

        while(l < r){
            int area = Math.min(height[l], height[r]) * (r - l);
            outcome = Math.max(outcome, area);

            if(height[l] <= height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return outcome;
    }
}