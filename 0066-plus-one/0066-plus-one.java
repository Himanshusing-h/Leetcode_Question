class Solution {
    public int[] plusOne(int[] digits) {
        //length of array
        int n=digits.length;
        //simple logic
        //loop ulta leke jao
        //do chize hongi
        //first arr[index]=9;
        //ya not equal to 9;
        //agar not equal to sidha add krke return
        //nai to uss index ko zero 
        //if saarre 9 honge to kuch return naii hoga or loop tut jaega
        //to ek nya array bnao +1 size ka usme pehle index pe 1 krke return
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            else{
                digits[i]=0;

            }


        }
        int [] ne=new int[n+1];
        ne[0]=1;
        return ne;
        
    }
}