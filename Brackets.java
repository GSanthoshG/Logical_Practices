package logical_practices;
//Bracket validation checking

/*input: "{(){[]}}" 
  output: valid
*/

import java.util.*;
public class Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> b = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                b.add(c);
            }
            else if(c=='}' && b.get(b.size()-1)=='{'){
                b.remove(b.size()-1);
            }
            else if(c==')' && b.get(b.size()-1)=='('){
                b.remove(b.size()-1);
            }
            else if(c==']' && b.get(b.size()-1)=='['){
                b.remove(b.size()-1);
            }
            else{
                break;
            }
        }
        if(b.size()==0){
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
        sc.close();
    }
}
