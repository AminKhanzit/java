import java.util.Scanner;
public class TestClass {
public static int a =10;

   // public class Amin {
        public static void main(String[] args) {
////double a =10.467584;
////            System.out.println(String.format("%.2f",a));
//            checkCharacterIsCapitalorSmaller();
  oneToHundredPrint();
//            printEvenNumbers();
//            countEvenNumbersOneToHundred();
//            divisbleFive();
//            factorial();
        }
        public static void oneToHundredPrint(){
            int i;
            for (i=1;i<=100;i++){
                System.out.println(i);
                System.out.println(a);
            }
        }
        public static void printEvenNumbers(){

            for (int i=1;i<=100;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
        public static void factorial(){
            Scanner scanner=new Scanner(System.in);
            int n = scanner.nextInt();
            long factorialValue=1;
            for (int i=1;i<=n;i++){
                factorialValue=factorialValue*i;
            }
            System.out.println(factorialValue);
        }
        public static void countEvenNumbersOneToHundred(){
           int sum =0;
           for (int i=1;i<=100;i++){
               if (i%2==0){
                  sum= sum+i;
               }
               System.out.println(sum);
           }


        }
        public static void divisbleFive(){
            for (int i =1;i<=100;i++){
                if (i%5==0){
                    System.out.println(i);
                }
            }
        }
        public static void checkCharacterIsCapitalorSmaller(){
            System.out.println("Enter a charecter to check:");
            Scanner scanner=new Scanner(System.in);
            char chars= scanner.next().charAt(0);
            if (chars >= 'a' && chars <= 'z'){
                System.out.println("Inputted character is Smaller " +chars);
            }
            else{
                System.out.println("Inputted character is Bigger  " +chars);
            }
        }
    }
