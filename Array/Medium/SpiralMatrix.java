class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int minr=0, minc=0, maxr=matrix.length-1, maxc=matrix[0].length-1;

            int count=1;
            List<Integer> Ans=new ArrayList<>();
            
            while(count <= matrix.length* matrix[0].length)
            {
            //Top wall
            for(int j=minc, i=minr; j<=maxc && count<=matrix.length* matrix[0].length;j++)
            {
                Ans.add(matrix[i][j]);
                count++;
            }
            minr++;
            // Right wall
            for(int i=minr, j=maxc;i<=maxr && count<=matrix.length* matrix[0].length;i++)
            {
                Ans.add(matrix[i][j]);
                count++;
            }
            maxc--;
            //Bottom wall
            for(int j=maxc, i=maxr; j>=minc && count<=matrix.length* matrix[0].length;j--)
            {
            Ans.add(matrix[i][j]);
                count++;
            }
            maxr--;
            
            // Left wall
                for(int i=maxr, j=minc;i>=minr && count<=matrix.length* matrix[0].length;i--)
                {
                    Ans.add(matrix[i][j]);
                    count++;
                }
                minc++;
                    
            }
                
            return Ans;
        }
    }