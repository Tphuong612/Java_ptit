
package UngDungJavaCollections;

import java.util.Scanner;
import java.util.Stack;

public class JKT014_DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int[n+1];
            a[0] = (int) 1e9;
            int b[] = new int[n+1];
            for(int i=1; i<=n; i++){
                a[i] = sc.nextInt();
            }
            st.push(0);// stack chua chi so
            b[0] = 1;
            for(int i=1; i<=n; i++){
                while(!st.empty() && a[st.peek()]<=a[i]){
                    st.pop();
                }
                if(st.size()>0) b[i] = i - st.peek();
                st.push(i);
            }
            for(int i=1; i<=n; i++){
                System.out.printf("%d ", b[i]);
            }
            System.out.println("");
            st.clear();
        }
    }
}
