public class Uniquepath {

    public static int uniquePaths(int r, int c) {
        if(r == 1 || c == 1){
            return 1;
        }
        
        int left = uniquePaths(r-1, c);
        int right = uniquePaths(r,c-1);
        
        return left+right;
    }

    public static void path(String p, int r, int c){
        if(r==1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p+"D", r-1, c);
        }

        if(c > 1){
            path(p+"R", r, c-1);
        }
    }

    public static void uniquepathDia(String p, int r, int c){
        if(r==1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1 && c > 1){
            uniquepathDia(p+"D", r-1, c-1);
        }

        if(r > 1){
            path(p+"V", r-1, c);
        }

        if(c > 1){
            path(p+"H", r, c-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
        path("",3,3);
        uniquepathDia("", 3, 3);
    }
}
