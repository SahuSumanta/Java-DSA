import java.util.HashMap;
import java.util.Map;

public class RomantoInt {

    /*
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    */

    public static int romanToInt(String s) {

        int result = 0;

     Map<Character, Integer> map = new HashMap<>();
     map.put('I', 1);
     map.put('V', 5);
     map.put('X', 10);
     map.put('L', 50);
     map.put('C', 100);
     map.put('D', 500);
     map.put('M', 1000);


     for(int i = 0; i < s.length(); i++){
         if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
            result += map.get(s.charAt(i));
         }else{
             result += map.get(s.charAt(i));
         }
     }

        result += map.get(s.charAt(s.length()-1));
     return result;
    }
    
    public static void main(String[] args) {
        String s= "III";
        System.out.println(romanToInt(s));
    }
}
