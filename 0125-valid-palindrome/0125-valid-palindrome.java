class Solution {
    public boolean isPalindrome(String s) {
        //approach is simple 
        //to lower case
        //new string which include alphanumer only
        //used two pointer opposite end
       String ans="";
       s=s.toLowerCase();
int i=0;
       while(i<s.length()){

       
           char ch=s.charAt(i);
           int x=ch;
           //important condition the numeric in alpha numeric have ascii code 48 to 57 and the question told to include alphanumeric
           if(x>=97 && x<=122  || x>=48 && x<=57){
            ans+=ch;
           }
           i++;
        }
        i=0;
        int j=ans.length()-1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}