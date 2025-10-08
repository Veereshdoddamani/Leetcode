class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int left=0;
        int right=col-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int maxrow=0;
            for(int i=0;i<row;i++){
                if(mat[i][mid]>mat[maxrow][mid]){
                    maxrow=i;
                }
            }

            int leftval = (mid-1>=0) ? mat[maxrow][mid-1] : -1;
            int rightval= (mid+1<col) ? mat[maxrow][mid+1] : -1;
            if(mat[maxrow][mid]>leftval && mat[maxrow][mid]>rightval){
                return new int[] {maxrow,mid};
            }
            else if(leftval>mat[maxrow][mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return new int[] {-1,-1};
        
    }
}