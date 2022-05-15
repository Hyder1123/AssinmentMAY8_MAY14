package DSA_ASS7;

import java.util.Scanner;

public class findAllSubStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a string : ");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
