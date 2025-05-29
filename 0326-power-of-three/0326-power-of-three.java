class Solution {
    public boolean checkPowerOfThree(int n) {
        if(n <= 0 ){
            return false;
        }if(n==1) {
            return true;
        }
        boolean result = checkPowerOfThree(n/3);
        if(result == false) {
            return result;
        }else {
            if(n%3==0){
                return true;
            }else {
                return false;
            }
        }
    }
    public boolean isPowerOfThree(int n) {
        boolean ans = checkPowerOfThree(n);
        return ans;
    }
}