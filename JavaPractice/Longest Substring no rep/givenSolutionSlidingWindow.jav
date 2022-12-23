public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> chars = new HashMap();

        //pointers
        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            //retrive value at key r, if no value exists set to 0 then add one
            chars.put(r, chars.getOrDefault(r,0) + 1);
            
            //if a duplicate is found it brings down the value of each key
            //as it moves towards the right pointer
            while (chars.get(r) > 1) {
                char l = s.charAt(left);
                chars.put(l, chars.get(l) - 1);
                left++;
            }
            //checks if the new substring is longer
            res = Math.max(res, right - left + 1);

            //increments the right pointer
            right++;
        }
        return res;
    }
}