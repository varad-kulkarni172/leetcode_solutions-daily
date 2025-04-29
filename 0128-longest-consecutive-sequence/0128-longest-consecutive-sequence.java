// Time complexity = nlogn + n + n + n + O(n logn)
// Space Complexity = O(n)
public class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){ // Edge Case Check
            return 0;
        }

        Arrays.sort(nums); // Sorting takes O(nlogn) time

        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // Using this as Set ensures each value appears only once

        for(int i : nums){
            set.add(i); // dropping duplicates
            // O(n) time for n constant insertions
        }

        List<Integer> list = new ArrayList<>(set); // As sets do not have indices, converting it into list gives random access to compare each element to its previous one
        // Convertion is O(n) time

        int maxStreak = 1;
        int currentStreak = 1;

        for(int i = 1; i < list.size(); i++){ // size() is used for HashSets
        // O(n) loop time
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