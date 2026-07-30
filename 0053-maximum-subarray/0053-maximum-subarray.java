class Solution {
    public int maxSubArray(int[] nums) {
        //approach teen chize hongi 
        //i=jo index traver krega
        //sum=jo subarray ka sum calculate krega
        //maxsum=jo maximum subarray ki value ko store krega
        //i ko zeroth index pe rakho or aaage krte jao
        //sum mai nums{i}ko add krte jao
        //maxsum nikal lo
        //if sum is negative then sum ko zero krdo means new subarray
        int i=0;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        while(i<nums.length){
sum=sum+nums[i];
if(sum>maxsum)maxsum=sum;
if(sum<0)sum=0;
i++;
        }
        return maxsum;
        
    }
}