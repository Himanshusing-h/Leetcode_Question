
        class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
if(nums[i]<pivot){

            list.add(nums[i]);
        }

    }
        for(int i=0;i<nums.length;i++){
if(nums[i]==pivot){

            list.add(nums[i]);
}
        }
        
for(int i=0;i<nums.length;i++){
    if(nums[i]>pivot){
list.add(nums[i]);
}
}
for(int i=0;i<nums.length;i++){
    nums[i]=list.get(i);
}

return nums;
    }
}
    
