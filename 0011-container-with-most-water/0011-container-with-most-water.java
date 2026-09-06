class Solution {
    public int maxArea(int[] height) {
        int maxvol=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int vol=0;
          if(height[i]<height[j]){
             vol=(j-i)*height[i];
            i++;
          }
          else{
vol=(j-i)*height[j];
j--;
          } 
          if(vol>maxvol)maxvol=vol;
        }
    
    return maxvol;
    }
}
