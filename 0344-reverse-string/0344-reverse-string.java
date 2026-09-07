class Solution {
    //approach 
    //two pointer
    //opposite end
    //swap
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        //condition for swapping
        while(i<j){

            char ch=s[i];
            s[i]=s[j];
            s[j]=ch;
            i++;
            j--;
        }
        
        
    }
}