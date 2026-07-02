class Solution {
    public int search(int[] nums, int target) {
return searchh(0,nums.length-1,target,nums);
//        int low =0;
//        int high=nums.length-1;
//     while(low<=high) {
//         int mid=(low+high)/2;
//         if(nums[mid]<target){
//             low=mid+1;
//         }
//         else if(nums[mid]>target){
//             high=mid-1;

//         }
//         else{
//             return mid;
//         }

//     }
//     return -1;
//     }
// }
    }
    //binary search involves low high target and array ,low at zero,high at last index,find mid
    //three case either less or more or got write cases for that 
    //loop condition low should not be greater than high
 public int searchh(int low,int high,int target,int[]arr){
    int mid=low+(high-low)/2;
    if(low>high)return -1;
 if(arr[mid]<target)return searchh(mid+1,high,target,arr);
    if(arr[mid]>target)return searchh(low,mid-1,target,arr);
    return mid;
}
    }