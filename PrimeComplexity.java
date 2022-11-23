package logical_practices;
//Prime number code with lowest time complexity

import java.util.Scanner;

public class PrimeComplexity {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("9999999900000001".length());
        long n = sc.nextLong();
        isPrime(n);
    }
    private static void isPrime(long n) {
        if(n<2){
            System.out.println("Not a prime number");
            return;
        }
        if(n==2){
            System.out.println("prime number");
            return;

        }
        if(n%2==0){
            System.out.println("Not");
            return;
        }
        int count=0;
        for(int i=3;i<Math.sqrt(n);i+=2){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime number");
            return;
        }
        System.out.println("Not");
    }
}
