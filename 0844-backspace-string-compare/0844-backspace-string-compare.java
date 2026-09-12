class Solution {
    public boolean backspaceCompare(String s, String t) {
        //approach simple create str ,traverse previous string if length 0 and # move on if # substring if nothing add ,do it for both string 
        //equate the strings return true or false
        int i=0;

        String str="";
        while(i<s.length()){
            
            char ch=s.charAt(i);
            if(str.length()==0 && ch=='#'){
                i++;
                continue;
            }
            else if(ch=='#')str=str.substring(0,str.length()-1);
            else str+=ch;
            i++;
        }
        s=str;
        String qt="";
         i=0;
        while(i<t.length()){
            
            char ch=t.charAt(i);
            if(qt.length()==0 && ch=='#'){
                i++;
                continue;
            }
            else if(ch=='#')qt=qt.substring(0,qt.length()-1);
            else qt+=ch;
            i++;
        }
        t=qt;
        if(s.equals(t))return true;
        else return false;
    }
}