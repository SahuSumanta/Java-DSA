import java.lang.annotation.Target;
import java.util.ArrayList;

/*
Question be like 
4 ==> {4,22,31,121,211,112,1111} 
q       o
*/
public class Dice {

    static void dicecomb(String p , int Target){
        if(Target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= Target; i++){
            dicecomb(p+i, Target-i);
        }
    }

    static ArrayList<String> dicecombRtn(String p , int Target){
        if(Target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= Target; i++){
            list.addAll(dicecombRtn(p+i, Target-i));
        }
        return list;
    }

    static int dicecombcount(String p , int Target){
        if(Target == 0){
            return 1;
        }

        int count = 0;
        for(int i = 1; i <= 6 && i <= Target; i++){
           count = count + dicecombcount(p+i, Target-i);
        }
        return count;
    }

    public static void main(String[] args) {
        dicecomb("", 4);
        System.out.println(dicecombRtn("", 4));
        System.out.println(dicecombcount("", 4));
    }
}
