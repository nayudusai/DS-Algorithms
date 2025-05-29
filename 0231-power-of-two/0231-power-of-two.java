class Solution {
    public boolean checkPowerOfTwo(int n){
        if(n==1){
            return true;
        }
        if(n%2==1 || n==0){
            return false;
        }
        boolean  result = checkPowerOfTwo(n/2);
        if(result == false){
            return false;
        }else {
            return true;
        }
    }
    public boolean isPowerOfTwo(int n) {
        boolean ans=checkPowerOfTwo(n);
        return ans;
    }
}