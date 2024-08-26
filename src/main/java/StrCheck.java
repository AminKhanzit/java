import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class StrCheck {

    public static void letterCount(){
        String country = "I Love Bangladesh";
      int count=  country.length();
        System.out.println(count);
    }

    public static void dou(){
       String munem = "Munem";
       char [] chars = munem.toCharArray();
        System.out.println(Arrays.toString(chars));

        char ch = munem.charAt(3);
        System.out.println(ch);

        int index = munem.indexOf('m');
        System.out.println(index);

        boolean contaext = munem.contains("u");
        System.out.println(contaext);

        boolean equal = munem.equals("Munem");
        System.out.println(equal);

        String replace = munem.replace("u", "t");
        System.out.println(replace);

        String sentence = "Hello Amin";
        String [] word = sentence.split("\\s");
        System.out.println(Arrays.toString(word));
        int length = word.length;

        System.out.println(length);
        String sub = sentence.substring(1,9);
        System.out.println(sub);

        String upper = sentence.toUpperCase();
        System.out.println(upper);

        String lower = sentence.toLowerCase();
        System.out.println(lower);

        String replaced = sentence.replace("H", "A");
        System.out.println(replaced);

        String name1="Amin Khan BD";
        String [] name2 = name1.split("\\s");
        int length1 = name2.length;
        System.out.println(length1);
        System.out.println(Arrays.toString(name2));
        char [] chars1 = name1.toCharArray();
        System.out.println(Arrays.toString(chars1));

        String trimmed = "    AMIN KHAN    ";
        String trimmed1= trimmed.trim();
        System.out.println(trimmed1);
    }

    public static void countLetter(){
        System.out.println("Enter Letters for Count: ");
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        char [] chars = next.toCharArray();
       int count= chars.length;
        System.out.println(count);

        String [] sd = next.split("\\s");
               System.out.println(Arrays.toString(sd));
              int sf= sd.length;
        System.out.println(sf);
    }
    public static void main(String[] args) {

       //letterCount();
       //dou();
        countLetter();


    }
    //        System.out.println("Enter Your String");
//        Scanner scanner = new Scanner(System.in);
//        String chars = scanner.next();
//        //String str ="Hello Bangladesh";
//        char[] cd = chars.toCharArray();
//        System.out.println(Arrays.toString(cd));

    public static void StringArrays(){
        String c = "Amin Khan";
        char [] ch = c.toCharArray();
        System.out.println("Your String is:" + Arrays.toString(ch));

        String a = "Amin";
        String b = "Amin";
        boolean equals = a.equals(b);
        System.out.println(equals);

        String firstName ="Amin";
        String lastName ="Kham";
        boolean firstLast = firstName.equals(lastName);
        boolean s=  firstName.contains("Amin");
        System.out.println(s);
        System.out.println(firstLast);
    }
}
