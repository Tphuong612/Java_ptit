/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.Scanner;
class ThiSinh{
    private String id, name, dob;
    private double mon1, mon2, mon3;
    private static int dem = 0;
    public ThiSinh(String name, String dob, double mon1, double mon2, double mon3){
        this.id = String.format("%d", ++dem);
        this.name = name;
        this.dob = dob;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }
    public double diem(){
        return mon1 + mon2 + mon3;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+dob+" "+ diem();
    }
}
public class J05009_TimThuKhoaCuaKyThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ThiSinh a[] = new ThiSinh[n];
        for(int i=0; i<n; i++){
            a[i] = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        double max = 0;
        for(int i=0; i<n; i++){
            if(max < a[i].diem()){
                max = a[i].diem();
            }
        }
        for(int i=0; i<n; i++){
            if(a[i].diem() == max) System.out.println(a[i]);
        }
    }
}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
*/
