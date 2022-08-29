class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r=matrix.length, c=matrix[0].length;
        
        for(int i=0;i<r;i++){
            for(int ii=0;ii<c;ii++){
                if(matrix[i][ii]==target){
                    return true;
                }
            }
        }
        return false;
        
    }
}