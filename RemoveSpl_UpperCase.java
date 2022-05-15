package DSA_ASS7;

public class RemoveSpl_UpperCase {
    public static void main(String[] args) {
        String s="Aste6%e#12(lop";
        String resullt="";
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
           if(c.isLowerCase(c) ||  c.isDigit(c)){
               resullt=resullt+c;
           }
        }
        System.out.println(resullt);
    }
}
