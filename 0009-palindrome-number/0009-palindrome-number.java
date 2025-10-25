class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int org=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int dig=x%10;
            rev = rev*10 + dig;
            x=x/10;
        }
        
        return rev==org;
    }
}