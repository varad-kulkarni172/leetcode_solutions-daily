class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){ // Edge Case Check
            return 0;
        }

        Arrays.sort(nums);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // Using this as Set ensures each value appears only once

        for(int i : nums){
            set.add(i); // dropping duplicates
        }

        List<Integer> list = new ArrayList<>(set);

        int maxStreak = 1;
        int currentStreak = 1;

        for(int i = 1; i < list.size(); i++){ // size() is used for HashSets
            if(list.get(i) == list.get(i - 1) + 1){ // Always compare the eaxh element with the previous element so initial valid comparison is between 1 and 0
                currentStreak++;
            }
            else{
                maxStreak = Math.max(maxStreak, currentStreak);
                currentStreak = 1;
            }
        }
        return Math.max(maxStreak, currentStreak);
    }
}