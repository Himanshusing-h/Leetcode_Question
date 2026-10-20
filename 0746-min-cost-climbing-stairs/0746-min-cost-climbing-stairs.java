class Solution {
    //thought process
    
    static int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        //yaha humne socha ki do chize ho sakti hain ya to hum ek step le ya to do
        //to return min kr diya ki jo min ho return ho jae
        return Math.min(mincost(0,cost),mincost(1,cost));
    }
    public int mincost(int i,int[] arr){
        if(i>=arr.length)return 0;
        if(dp[i]!=-1)return dp[i];
        //abb isme hum jis step pe hain uske paise to judenge or aage hum ek step le sakte hain ya do to uska min
        dp[i] =arr[i]+Math.min(mincost(i+1,arr),mincost(i+2,arr));
        return dp[i];
    }
}