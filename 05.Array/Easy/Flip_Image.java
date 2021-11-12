public class Flip_Image {
    
    public int[][] flipAndInvertImage(int[][] A) {
        
        //Invert Image
        for(int i =0;i<A.length;i++){
            for(int j =0;j<A[i].length;j++){
                A[i][j] = A[i][j]==1? 0:1;
            }
        }
        
        
        //Flip Image
         for(int i=0;i<A.length;i++){
            for(int j =0;j<A[i].length/2;j++){
                int temp = A[i][j];
                A[i][j] = A[i][A.length-j-1];
                A[i][A.length - j - 1] = temp;
            }
        }
        
        //return 
        return A;
        
    }

}
