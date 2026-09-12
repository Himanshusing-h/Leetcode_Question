class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        if(n==0)return 0;
        int ans=0;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        for(int j=n-2;j>=0;j--){
            rightmax[j]=Math.max(height[j],rightmax[j+1]);
        }
        for(int i=0;i<height.length;i++){
            int count=Math.min(leftmax[i],rightmax[i])-height[i];
ans+=count;
        }
        return ans;
    }

}