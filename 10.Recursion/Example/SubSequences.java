import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {

        subseq("", "abc");
        System.out.println(subseqAlist("", "abc"));
        subseqASCII("", "ab");
    }


    public static void subseq(String p, String Up){
        if(Up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = Up.charAt(0);
        subseq(p+ch, Up.substring(1));
        subseq(p, Up.substring(1));
    }


    //output using Arraylist

    public static ArrayList<String> subseqAlist(String p, String Up){


        if(Up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = Up.charAt(0);

        ArrayList<String> left =  subseqAlist(p+ch, Up.substring(1));
        ArrayList<String> right = subseqAlist(p, Up.substring(1));

        left.addAll(right);
        return left;

    }

    //Subsequence of ASCII value
    public static void subseqASCII(String p, String Up){
        if(Up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = Up.charAt(0);
        subseqASCII(p+ch, Up.substring(1));
        subseqASCII(p, Up.substring(1));
        subseqASCII(p+(ch+0), Up.substring(1));
    }


}