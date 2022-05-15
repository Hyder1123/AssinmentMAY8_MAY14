package DSA_ASS7;

public class RemoveSpecailchar {
    public static void main(String[] args) {
        String s="afgt%y^u#";
        String s1="";
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(c.isLetter(c)){
                s1=s1+c;
            }
        }
        System.out.println(s1);
    }
}
