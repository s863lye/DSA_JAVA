class Solution {
    public int reverse(int x) {
      int rev = 0;
      int negative = Integer.MIN_VALUE;
        while(x != 0){
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
           int lstdigit = x % 10;
           rev = rev*10 + lstdigit;
           x = x / 10;
        }
         
        return rev;
    }
}