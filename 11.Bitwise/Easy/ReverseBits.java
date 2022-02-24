
public class ReverseBits {
    public int reverseBits(int a) {
        int b=0;
         for(int i=0;i<32;i++)
         {
            b=b<<1;
            b=b|a&1;
            a=a>>1;
         }
          return b; 
    }
}
