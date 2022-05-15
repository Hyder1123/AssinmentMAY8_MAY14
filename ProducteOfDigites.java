package DSA_ASS7;

public class ProducteOfDigites {
    public static void main(String[] args) {
        String s="as13r52eau2";
       int product= findProdute(s);
       System.out.println(product);
    }

    private static int findProdute(String s) {
        int p=1;
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);

            if(c.isDigit(c)){
               int j=Integer.valueOf(c);

                p=p*j;
                //System.out.println(p);

            }
        }
        //System.out.println(p);
        return p;
    }
}
