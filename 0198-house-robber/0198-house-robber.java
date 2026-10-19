class Solution {
    //dp is like if there is two call function think of dp because it helps us to reduce te tree to ladder
    static int[] dp;
    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return loot(0,nums);
    }
    public int loot(int i,int[] arr){
        if(i>=arr.length)return 0;//> sign is used because it may happen that i is on second last index and jumps two times
        if(dp[i]!=-1)return dp[i];
        int pick=arr[i]+loot(i+2,arr);
        int skip=loot(i+1,arr);
        int ans=Math.max(pick,skip);
        dp[i]=ans;
        return ans;
    }
}