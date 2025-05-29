class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        boolean result = isPowerOfFour(n/4);
        if(result == false) {
            return result;
        }
        else {
            if(n%4==0){
                return true;
            }
            else {
                return false;
            }
        }
    }
}