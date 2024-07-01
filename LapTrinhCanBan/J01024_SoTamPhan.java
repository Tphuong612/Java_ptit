/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhCanBan;
import java.util.Scanner;
public class J01024_SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            int check = 1;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '0' ){
                    check = 0;
                    break;
                } 
            }
            if(check == 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
        
}
