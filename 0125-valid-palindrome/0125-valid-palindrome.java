public class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder str = new StringBuilder(); // create a mutable string to modify
        // for(char c : s.toCharArray()){
        //     if(Character.isLetterOrDigit(c)){ // Wrap in Character utility to filter after converting it to alphanumeric
        //         str.append(Character.toLowerCase(c));
        //     }
        // }
        // return str.toString().equals(str.reverse().toString());

    //     int l = 0, r = s.length() - 1;

    //     while(l < r){
    //         while(l < r && !alphanumeric(s.charAt(l))){
    //             l++;
    //         }
    //         while(r > l && !alphanumeric(s.charAt(r))){
    //             r--;
    //         }

    //         if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
    //             return false;
    //         }

    //         l++; r--;
    //     }
    //     return true;
    // }

    // public boolean alphanumeric(char c){
    //     return (c >= 'A' && c <= 'Z' || 
    //         c >= 'a' && c <= 'z' || 
    //         c >= '0' && c <= '9');
    //     }

    // My own solution using stringbuilder, alphanumeric and 2 pointers; TC is O(n) and SC is also O(n)
    StringBuilder newStr = new StringBuilder();
    for(char c : s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            newStr.append(Character.toLowerCase(c));
        }
    }

    String cleanStr = newStr.toString();

    int l = 0, r = cleanStr.length() - 1;

    while(l < r){
        if(cleanStr.charAt(l) != cleanStr.charAt(r)){
            return false;
        }
        l++; r--;
    }
    return true;
    }
}