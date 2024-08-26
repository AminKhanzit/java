import java.util.Scanner;

public class PrimeClass {
    public static void main(String[] args) {
        System.out.println("Enter the number to find out Prime or not");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        boolean isPrime=true;
        if (n<1){
            isPrime = false;
        }
        for (int i =2; i<n;i++){
            if (n%i==0){
                isPrime =false;
                break;
            }
        }
        if (isPrime){
            System.out.println(n +" Is a Prime Number");
        }
        else {
            System.out.println(n +" is Not a prime number");
            System.out.println("Try Again");
        }

    }
}
