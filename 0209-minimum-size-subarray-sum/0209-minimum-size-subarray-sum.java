class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int n=nums.length;
        int sum=0;
        int length=0;
        int result=Integer.MAX_VALUE;
        while(high<n){
            sum+=nums[high];
            while(sum>=target){
                length=high-low+1;
                result=Math.min(length,result);
                sum=sum-nums[low];
                low++;
 }
 high++;
        }
        if(result==Integer.MAX_VALUE){
            return 0;
        }
       else return result;
    }
}