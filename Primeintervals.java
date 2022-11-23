package logical_practices;
//finds all prime numbers within a given interval

import java.util.*;
public class Primeintervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
        sc.close();

    }

    public static boolean isprime(int temp){
        for (int i = 3; i < temp; i++) {
            if(temp%i==0){
                return false;
            }
        }
        return true;
        
    }
    
}
