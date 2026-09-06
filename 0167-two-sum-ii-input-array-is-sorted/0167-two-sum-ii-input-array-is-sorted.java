class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //classic example of two pointer opposite end
        int[] ans=new int[2];
    int i=0;
    int j=numbers.length-1;
    while(i<j){
        if(numbers[i]+numbers[j]>target){
            j--;

        }
    else if(numbers[i]+numbers[j]<target){
        i++;
    }
    else{
        //one based indexing so that the reason we are adding one 
        ans[0]=i+1;
        ans[1]=j+1;
        //return here is used to stop the loop 
return ans;
    }

    }
    return ans;
        
    }
}