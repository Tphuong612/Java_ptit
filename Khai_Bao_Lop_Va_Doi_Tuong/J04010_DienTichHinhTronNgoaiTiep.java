/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khai_Bao_Lop_Va_Doi_Tuong;

import static java.lang.Math.*;
import java.util.Scanner;
class Point{
    private double x, y;
    public Point(){
        x = 0;
        x = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point( Point p){
        this.x = p.x;
        this.y = p.y;                
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point p){
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }
    public double distance(Point a, Point b){
        return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
    }
    @Override
    public String toString(){
        return x + " " + y;
    }
}
public class J04010_DienTichHinhTronNgoaiTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double m = a.distance(b), n = b.distance(c), p = a.distance(c);
            if(m + n > p && m + p > n && n + p > m){
                double S = (double)1 / 4 * Math.sqrt((m + n + p) * (m + n - p) * (m - n + p) * (-m + n + p));
                double R = (m*n*p)/(4*S);
                System.out.printf("%.3f\n", R*R*PI);
            }
  
            else System.out.println("INVALID");            
        }      
    }        

}
