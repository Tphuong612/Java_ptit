
package Khai_Bao_Lop_Va_Doi_Tuong;

import java.util.Scanner;

class ThiSinh{
    private String name;
    private String date;
    private float point1, point2, point3;
    private float sum = point1 + point2 + point3; 
    public ThiSinh(){
        name = date = "";
        point1 = point2 = point3 = 0;
    }
    public ThiSinh(String name, String date, float point1, float point2, float point3){
        this.name = name;
        this.date = date;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        sum = point1 + point2 + point3; 
    }
    @Override
    public String toString(){
        return name + ' ' + date + ' ' + sum;
    }
}
public class J04005_KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(a);
    }
}
