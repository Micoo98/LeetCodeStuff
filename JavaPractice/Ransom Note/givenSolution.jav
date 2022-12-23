public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //make array the size of the alphabet
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            //changing int equivilant of letter from 0 to 1
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            //checking to see if when decremented the value of the letter in the array is less than zero
            //if it is then it means that there where no instances of it inside magazine
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}