/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UngDungJavaCollections;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for(int i=0; i<s.length(); i++){
                if(st.empty()) st.push(s.charAt(i));
                else{
                    if(st.peek()=='(' && s.charAt(i)==')') st.pop();
                    else if(st.peek()=='{' && s.charAt(i)=='}') st.pop();
                    else if(st.peek()=='[' && s.charAt(i)==']') st.pop();
                    else st.push(s.charAt(i));
                }
            }
            if(st.empty()) System.out.println("YES");
            else System.out.println("NO");
            st.clear();
            
        }
        
    }
}
