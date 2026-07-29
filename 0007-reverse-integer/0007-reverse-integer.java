class Solution {
    public int reverse(int x) {
        int newnum=0;
        int reminder=0;
        int sign;
        if(x<0)
        {
            sign=-1;
            x=sign*x;//making it positive for loop
        }
        else sign=1;
        while(x>0){

reminder=x%10;
//important condition to keep in mind
//this is done to avoid overflow

            if (newnum > Integer.MAX_VALUE / 10 ||(newnum == Integer.MAX_VALUE / 10 && reminder > 7))
                return 0;

            if (newnum < Integer.MIN_VALUE / 10 || (newnum == Integer.MIN_VALUE / 10 && reminder < -8))
                return 0;
newnum=newnum*10+reminder;
x=x/10;
        }
        return sign*newnum;
        
    }
}