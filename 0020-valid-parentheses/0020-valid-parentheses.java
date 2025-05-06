class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack<>(); // Initialise stack
        java.util.Map<Character, Character> CloseToOpen = new java.util.HashMap<>(); // Create hashmap to compare key va;ue pairs
        CloseToOpen.put(')', '('); // key is ) and value is (
        CloseToOpen.put(']', '[');
        CloseToOpen.put('}', '{');

        for(char res : s.toCharArray()){
            if(CloseToOpen.containsKey(res)){ // Check first if the hashmap created contains the Key 1st or not
                if(!parenthesis.isEmpty() && parenthesis.peek() == CloseToOpen.get(res)){
                    parenthesis.pop();
                }
                else{
                    return false;
                }
            } 
            else{
                parenthesis.push(res);
            }
        }

        return parenthesis.isEmpty();
    }
}
