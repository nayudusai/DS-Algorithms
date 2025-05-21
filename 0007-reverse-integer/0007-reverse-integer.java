class Solution {
    public int reverse(int x) {
        int rem = 0;
        int rev = 0;
        int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
        while (x != 0) {
            rem = x % 10;
            if (rev > max/10 || rev < min/10) {
                return 0;
            }
            x =x/10;
            rev = rev*10 + rem;
        }
        return rev;
    }
}