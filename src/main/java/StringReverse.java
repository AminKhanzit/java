public class StringReverse {
    public static void main(String[] args) {
        String str="I Need Money";
        String rev="";
        char [] chars=str.toCharArray();
        for (int i=chars.length-1;i>=0;i--){
           rev=rev+chars[i];

        }
        System.out.println(rev);
    }
}
