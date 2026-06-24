class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int right=matrix.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int i=0;
            int j=matrix[0].length-1;
            if(target<=matrix[mid][j] && target>=matrix[mid][0]){
                while(i<=j){
                    int mid1=i+(j-i)/2;
                    if(matrix[mid][mid1]==target){
                        return true;
                    }else if(matrix[mid][mid1]>target){
                        j=mid1-1;
                    }else{
                        i=mid1+1;
                    }
                }
                return false;
            }else if(matrix[mid][j]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return false;
    }
}
