// returns prime number within the given number
package logical_practices;
import java.util.*;
public class Primenumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    for(int i=2;i<=a;i++){
	        boolean flag=true;
	        for(int j=2;j<i;j++){
	        if(i%j==0){
	            flag=false;
	            break;
	        }
	        }
	        if(flag){
	          	System.out.print(i+" ");  
	        }
	        }
			sc.close();
	    }
}
