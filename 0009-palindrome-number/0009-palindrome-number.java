class Solution {
    public boolean isPalindrome(int x) {
        //simple approach
        //reverse normally nikala
        //old num ko store kiya ek jagah
        //edge cases ko handle kiya
        int newnum=0;
        int reminder=0;
        int oldnum=x;
        while(x>0){
            reminder=x%10;
            //edge case
            if(newnum>Integer.MAX_VALUE/10 || newnum==Integer.MAX_VALUE/10 && reminder>7)return false;
            if(newnum<Integer.MIN_VALUE/10 || newnum==Integer.MIN_VALUE/10 && reminder<-8)return false;
            newnum=newnum*10+reminder;
            x=x/10;
        }
        if(newnum==oldnum)return true;
        else return false;
    }
}