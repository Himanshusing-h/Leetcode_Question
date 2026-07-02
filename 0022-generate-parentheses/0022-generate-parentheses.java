class Solution {
    public List<String> generateParenthesis(int n) {
        //created string list
        List<String> list=new ArrayList<>();
        //calling function
        generate(0,0,"",list,n);
        //returnig function
        return list;
    }
    //taking five input left l,right r,str " ",string list,n is pair of parenthesis therefore total no of parenthesis is 2*n;
    void generate(int l,int r,String str,List<String> list,int n){
        //base case if all bracket are applied then str length will be twice of n;
        if(str.length()==2*n){
            //add str in the list 
list.add(str);
return;
        }

        //we can apply left until it is not completed
        if(l<n)generate( l+1, r, str+"(", list,n);
        //we cant apply right bracket until left bracket for right is present;
        //therefore we will only applly right when r is less than left
        if(r<l)generate( l, r+1, str+")", list,n);
    }
}