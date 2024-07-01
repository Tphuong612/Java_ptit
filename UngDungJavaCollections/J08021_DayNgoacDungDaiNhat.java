
package UngDungJavaCollections;

import java.util.Scanner;
import java.util.Stack;


public class J08021_DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>(); // luu chi so
            int dem = 0;
            st.push(-1); //dam bao luon co so lien truoc cua phan tu bat dau day ngoac
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '(') st.push(i);
                else{
                    st.pop();
                    if(!st.empty()) dem = Math.max(dem, i-st.peek());
                    else st.push(i);
                }
            }
            System.out.println(dem);
        }
    }
}
    

