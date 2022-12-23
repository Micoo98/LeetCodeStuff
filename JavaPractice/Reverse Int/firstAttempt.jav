class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int temp = Math.abs(x);
        while(temp >= reversed)
        {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        if(x < 0)
        {
            x = -reversed * 10 - temp;
        }
        else
        {
            x = reversed * 10 + temp;
        }
        return x;
    }
}