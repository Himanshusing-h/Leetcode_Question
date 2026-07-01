class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    //created arraylist as we have to return arraylist
        ArrayList <Integer> list=new ArrayList<>();
        //initializing
        int fr=0;
        int lr=matrix.length-1;
        int fc=0;
        //initializing column
        int lc=matrix[0].length-1;
        //this condition should be true for executing 
        while(fr<=lr && fc<=lc){
            //The for loop moves across columns.
//But it is moving on the bottom row (mat[lr][j]).
//Before traversing, you must make sure that the bottom row still exists.
//Does the bottom row still exist?"
            if(fr<=lr){
            for(int j=fc;j<=lc;j++){
                list.add(matrix[fr][j]);
            }
            }
            fr++;
           // Does the left column still exist?"
            if(fc<=lc){
            for(int i=fr;i<=lr;i++){
                list.add(matrix[i][lc]);
                
            }
            }
            lc--;
             if(fr<=lr){
            for(int j=lc;j>=fc;j--){
                list.add(matrix[lr][j]);
            }
             }
            lr--;
            if(fc<=lc){
            for(int i=lr;i>=fr;i--){
                list.add(matrix[i][fc]);
            }
            }
            fc++;
          
            
        }
        return list;
    }
}

    