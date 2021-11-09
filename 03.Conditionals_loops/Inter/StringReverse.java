
public class StringReverse {
    public static void main(String[] args) {
        String Name = "Sumanta";
        char[] ch_Arr = Name.toCharArray();

        for (int i = ch_Arr.length-1; i >= 0; i--) {

            System.out.print(" "+ch_Arr[i]);

        }
        System.out.println();
        // System.out.println(+Arrays.toString(ch_Arr)); 
    }
}
