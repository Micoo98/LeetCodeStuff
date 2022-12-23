public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        //res used to represent longest substring with no repetition
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    //checks to see if the newest substring is longer than the last
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }

    //checks if the range given contains any repetition
    private boolean checkRepetition(String s, int start, int end) {
        //creates a hashset to place characters to check for repeats
        Set<Character> chars = new HashSet<>();

        for (int i = start; i <= end; i++) {
            //adds all chars in the substring to the hashset and checks for repeats each time
            char c = s.charAt(i);
            if(chars.contains(c)){
                return false;
            }
            chars.add(c);
        }
        //if no repeats then true
        return true;
    }
}