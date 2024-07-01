
package Khai_Bao_Lop_Va_Doi_Tuong;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
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
    public static Point nextPoint(Scanner ip){
        Point a = new Point(0,0);
        a.x = ip.nextDouble();
        a.y = ip.nextDouble();
        return a;
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
    public static double distance(Point a, Point b){
        return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
    }
    @Override
    public String toString(){
        return x + " " + y;
    }
}
class Triangle{
    private Point p1, p2, p3;
    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public boolean valid(){
        double a = Point.distance(p1, p2);
        double b = Point.distance(p2, p3);
        double c = Point.distance(p1, p3);
        return (a+b>c && a+c>b && b+c>a);
    }
    public String getPerimeter(){
        double a = Point.distance(p1, p2);
        double b = Point.distance(p2, p3);
        double c = Point.distance(p1, p3);
        return String.format("%.3f", a+b+c);
    }
    
}
public class J04019_LopTriangle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
