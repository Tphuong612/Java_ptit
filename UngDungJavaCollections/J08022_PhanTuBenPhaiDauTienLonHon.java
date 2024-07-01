
package UngDungJavaCollections;

import java.util.Scanner;
import java.util.Stack;


public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                b[i] = -1;       
            }
            Stack<Integer> st = new Stack<>();
            for(int i=n-1; i>=0; i--){
                while(st.size()>0 && st.peek()<=a[i]){
                    st.pop();
                }
                if(st.size()>0 && st.peek()>a[i]) b[i] = st.peek();
                st.push(a[i]);
            }
            for(int i=0; i<n; i++){
                System.out.print(String.format("%d ", b[i]));
            }   
            System.out.println("");
        }
        
    }
}
