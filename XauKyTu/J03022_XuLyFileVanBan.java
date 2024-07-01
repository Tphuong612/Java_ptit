/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XauKyTu;

import java.util.Scanner;


public class J03022_XuLyFileVanBan {
    public static String chuanHoa(String a){
        return a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            s += line + " ";
            if(line.isEmpty()) break;
        }
        
        String cau[] = s.trim().split("[?.!]");
        for(String i: cau){
            //System.out.println(i);
            String word[] = i.trim().toLowerCase().split(" +");
            System.out.print(chuanHoa(word[0])+" ");
            for (int j = 1; j < word.length; j++) {
                System.out.printf(word[j] + " ");
            }
            System.out.println("");
        }
    }
}
/*
ky thi LAP TRINH ICPC PTIT  bat dau to chuc     tu     nam 2010. nhu vay, nam nay la          tron 10 nam!
    vay CO PHAI NAM NAY LA KY THI LAN THU 10?        khong phai! nam nay la KY THI LAN THU 11.
*/