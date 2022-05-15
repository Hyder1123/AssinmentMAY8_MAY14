package DSA_ASS7;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String s1="Fire";
        String s2="Fried";
        boolean bool=angram(s1,s2);
        System.out.println(bool);
    }

    private static boolean angram(String s1, String s2) {
        s1.toLowerCase();
        s2.toLowerCase();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        boolean status=true;
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            return true;
        }


        return false;
    }
}
