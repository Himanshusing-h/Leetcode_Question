class Solution {
    //approach
    //create hashset and one arr
    //insert element into hashset,but before inserting check wheather target-num[i] present in the hashset if yes you got your number store the index in arr break the loop
    //if not insert the element into hashset
    
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set=new HashSet<>();
        int []arr=new int[2];
        int first=0;
        int second=0;
    for(int i=0;i<nums.length;i++){
        if(set.contains(target-nums[i])){
            first=target-nums[i];
            arr[1]=i;
            break;
        }
        else{
            set.add(nums[i]);
        }

    }
    for(int i=0;i<nums.length;i++){
        if(nums[i]==first){
            arr[0]=i;
break;
    }
    }
    return arr;
    }
}