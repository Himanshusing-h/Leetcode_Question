class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        //approach
        //find avg of first sub array then compare and increase count
        int avg=0;
        int low =0;
        int high=0;
        int n=arr.length;
        int sum=0;
        int count=0;
        while(high<k){
sum+=arr[high];
high++;
        }
        avg=sum/k;
 
        while(high<n){
            if(avg>=threshold){
                count++;
            }
            sum=sum-arr[low]+arr[high];
            avg=sum/k;
            low++;
            high++;
        
        }
        if(avg>=threshold)count++;
        return count;
        
    }
}