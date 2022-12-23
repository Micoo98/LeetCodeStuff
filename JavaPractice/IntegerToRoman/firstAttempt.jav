class Solution {
    public String intToRoman(int num) {
        //make a dictionary for the roman characters
        Map<Character, Integer> dic = new HashMap<>(){{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }}
        String ans = "";

        while(num != 0)
        {
            //while num is greater than zero keep taking away
            if(num >= dic.get("M"))
            {
                num = num % dic.get("M");
                ans += "M";
            }
            else if(num >= dic.get("D"))
            {
                //
            }
        }
    }
}