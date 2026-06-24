class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        //count will count no of element except val
        int count =0;
        //this loop will iterate over array find element which is not equal to val  and add it to arraylist,so we will create an arraylist which will have same order and also will not have val
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                list.add(nums[i]);
                count++;
            }
            
        }
        //this will transfer arraylist element to array so upto listsize and we dont care about element after that
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        //returning count
        //and array is also corrected 
        return count;
        
    }
}