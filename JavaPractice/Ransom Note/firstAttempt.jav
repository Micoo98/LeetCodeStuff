class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int numDeleted = 0;
        StringBuilder sb = new StringBuilder(ransomNote);
        boolean goodSoFar = false;
        for(int i = 0; i < magazine.length(); i++)
        {
            char a = magazine.charAt(i);
            goodSoFar = false;
            if(ransomNote == "") return true;
            for(int j = 0; j < magazine.length(); j++)
            {
                char b = ransomNote.charAt(j);
                //check each char in ransomNote then remove char if match found
                if(a == b && goodSoFar == false)
                {
                    sb.deleteCharAt(ransomNote.charAt(j - numDeleted));
                    numDeleted += 1;
                    goodSoFar = true;
                }
            }
        }
        return false;
    }
}