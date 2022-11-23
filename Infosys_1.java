package logical_practices;
import java.util.*;
public class Infosys_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = "john";
        String input2 = "johny";
        String input3 = "janardhan";
        int l1 = input1.length();
        int l2 = input2 .length();
        int l3 = input3.length();
        String out1 = "", out2 = "", out3 = "";
        out1 += input1.substring(0, (int)Math.round(l1/3.0))+"";
        out1 += input2.substring(0, (int)Math.round(l2/3.0))+"";
        out1 += input3.substring(0, (int)Math.round(l3/3.0))+"";
        out2 += input1.substring((int)Math.round(l1/3.0), 2*(int)Math.floor(l1/3.0)+1)+"";
        out2 += input2.substring((int)Math.round(l2/3.0), 2*(int)Math.floor(l2/3.0)+1)+"";
        out2 += input3.substring((int)Math.round(l3/3.0), 2*(int)Math.floor(l3/3.0))+"";
        out3 += input1.substring(2*(int)Math.floor(l1/3.0)+1)+"";
        out3 += input2.substring(2*(int)Math.floor(l2/3.0)+1)+"";
        out3 += input3.substring(2*(int)Math.floor(l3/3.0))+"";
        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
    }
}
