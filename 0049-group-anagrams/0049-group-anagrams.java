class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> output = new HashMap<>();

        for(String string : strs){
            char[] charArray = string.toCharArray(); // convert string to char array
            Arrays.sort(charArray);
            String srtds = new String(charArray); // converts the sorted char array back to string
            output.putIfAbsent(srtds, new ArrayList<>()); // if srtds (here, the key) not in hashmap then put it there with empty list as its value
            output.get(srtds).add(string); // get the output from hasmhmap and add to the string
        }
        return new ArrayList<>(output.values());
    }
}