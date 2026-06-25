class Solution {
    public boolean isAnagram(String s, String t) {
    
        //converting string to array as string cant be sorted
         char[] s1n = s.toCharArray();
        Arrays.sort(s1n);
        //converting string to array as string cant be sorted
         char[] s2n = t.toCharArray();
        Arrays.sort(s2n);
        //comparing array
        if(Arrays.equals(s1n, s2n))return true;
        else return false;
    }
}
        

