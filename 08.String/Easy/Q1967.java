import java.util.HashSet;
import java.util.Set;

public class Q1967 {
    public static int numOfStrings(String[] patterns, String word){

        Set<String> set = new HashSet<>();
        //find all the substring of given word
        for (int i = 0; i <= word.length(); i++) {
            for (int j = i+1; j <= word.length(); j++) {
                set.add(word.substring(i, j));
            }
        }

        //match all the substing with pattern and countmatched pattern
        int count = 0;
        for (String i  : patterns) {
            if(set.contains(i)){
               count++; 
            } 
        }
        return count;
        
    }

    public static void main(String[] args) {
        String patterns[] = {"a","abc","bc","d"}, word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }


}
