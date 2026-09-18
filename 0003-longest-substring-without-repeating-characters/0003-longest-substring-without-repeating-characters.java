class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int maxcount=0;
        int count =0;
        HashSet<Character> set=new HashSet<>();
        for(int high=0;high<s.length();high++){
            //making sure high is unique
            while(set.contains(s.charAt(high))){
                set.remove(s.charAt(low));
                count--;
                low++;
            }
            set.add(s.charAt(high));
            count++;
     
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}