class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        for(int i = 1; i <= n; i++)
        {
            boolean isDivBy3 = (i % 3 == 0);
            boolean isDivBy5 = (i % 5 == 0);
            
            String ansStr = "";
            if(isDivBy3)
            {
                ansStr += "Fizz";
            }
            if(isDivBy5)
            {
                ansStr += "Buzz";
            }
            if(ansStr == "")
            {
                ansStr += Integer.toString(i);
            }
            answer.add(ansStr);
        }
        return answer;
    }
}