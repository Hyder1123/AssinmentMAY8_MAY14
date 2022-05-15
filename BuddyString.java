package DSA_ASS7;

public class BuddyString {
    public static void main(String[] args) {
        String s="aaaaaaabc";
        String goal="aaaaaaacb";

        boolean buddy=buddyString(s,goal);
        System.out.println(buddy);
    }

    private static boolean buddyString(String s, String goal) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        s.replaceAll("bc",rev);
        if(rev.equals(goal)){
            return true;
        }


        return false;
    }
}
