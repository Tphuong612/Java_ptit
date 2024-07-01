
package XauKyTu;
import java.util.Scanner;
import java.util.Stack;
public class J03027_RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<a.length(); i++){
            if(st.empty()) st.push(a.charAt(i));
            else{
                if(st.peek() == a.charAt(i)) st.pop();
                else st.push(a.charAt(i));                
            }           
        }
        if(st.empty()) System.out.println("Empty String");
        else{
            String tmp = "";
            while(!st.empty()){
                tmp += st.peek();
                st.pop();
            }
            String kq = new StringBuilder(tmp).reverse().toString();
            System.out.println(kq);
        }
        

    }
}
