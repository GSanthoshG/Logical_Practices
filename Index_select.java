/*
input:
1234 
4321 
5678 
8765
3

output:
3157
*/

package logical_practices;
import java.util.*;
public class Index_select {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        e = e-1;
        String arr[] = {a+"",b+"",c+"",d+""};
        String s = "";
        int n = 0;
        for(int i=0;e<=3;i++){
            s += arr[i].charAt(e++);
            n = i+1;
        }
        int v = 0;
        for(int i=n;i<=3;i++){
            s += arr[i].charAt(v++);
        }
        System.out.println(s);
    }
}
