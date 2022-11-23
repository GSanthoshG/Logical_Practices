package logical_practices;
import java.util.*;

 public class Fibonacci_recursion {

     static void fibonacci(int a, int b, int count){
         System.out.println(a+b);
         count--;
         if(count!=0){
             fibonacci(b, a+b, count);
         }
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int count = sc.nextInt();
         System.out.println(0);
         System.out.println(1);
         int a = 0;
         int b = 1;
         fibonacci(a,b,count-2);
         sc.close();
     }
 }