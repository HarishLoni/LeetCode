class Solution {
    
    public static void transpose(int[][] mat){
        int n=mat[0].length;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    
    public static void reverse(int[][] mat){
        for(int[] arr:mat){
            reverse(arr,0,arr.length-1);
        }
    }
    
    public static void reverse(int[] arr,int l,int h){
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;h--;
        }
    }
    
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
}