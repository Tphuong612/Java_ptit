
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
public class J04001_KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){           
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextInt(), sc.nextInt());
            System.out.printf("%.4f\n", p1.distance(p2));
        }

    }
}
