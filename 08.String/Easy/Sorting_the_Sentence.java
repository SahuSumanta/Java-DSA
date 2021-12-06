import java.util.Arrays;

public class Sorting_the_Sentence {

    public static String sortSentence(String s) {
        String[] arr = s.split(" "); //{Myself2, Me1, I4, and3}
        String[] temp = new String[arr.length]; //to store the string in the right order
        /* arr = 1,2,3,4
           temp = 0,1,2,3

           Me1
           temp[0] = Me;
           tmep[1] = Myself;
           temp[2] = and;
           temp[3] = I;
           
        */
        String result = ""; //initialsized

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i].charAt(arr[i].length()-1)-'0';
            temp[index-1] = arr[i].substring(0,arr[i].length()-1); //substring is used to remove the number present last

        }
        for (int i = 0; i < temp.length; i++) {
            result += temp[i];
            result += " ";  // used for to get the string like "Me myself and I" with space. 
        }

        return result.trim(); //trim used to remove the last space of the string
    }
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
    }
}
 
//String Builder Method
    // String[] str = s.split(" ");                // Since the String contains only whitespaces, it's safe to split the String at them
	// String[] res = new String[str.length];      // This String array will hold the rearranged words
	// StringBuilder sb = new StringBuilder();     // Instead of using '+' operator to concat repeatedly, I have created a StringBuilder object which is more efficient
	// int i = 0;                          
	// for (String elem : str) {
		// i = (int) (elem.charAt(elem.length() - 1) - '0');  // This  will extract the digit present at the end of each String and store it in i (i = index of the word in res[])
		// res[i - 1] = elem.substring(0, elem.length() - 1); // This gives the substring of each String except for the digit in the end and stores the word at an appropriate index (i - 1) in res[]
	// }
	//append the words from res[] to StringBuilder object to form a sentence
	// for (i = 0; i < res.length - 1; i++)
		// sb.append(res[i]).append(" ");
	// sb.append(res[i]);
	// return sb.toString();