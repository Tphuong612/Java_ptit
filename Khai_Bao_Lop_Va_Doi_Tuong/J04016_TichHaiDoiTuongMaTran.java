//
//package Khai_Bao_Lop_Va_Doi_Tuong;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class Matrix{
//    private int n, m;
//    private long[][] matrix = new long[1001][1001];
//    
//    public Matrix(int n, int m) {
//        this.n = n;
//        this.m = m;
//        matrix = new long[n][m]; //quan trong, ko co dong nay thi mang mac dinh la chua khai bao -> loi
//        
//    }
//
//    public void nextMatrix(Scanner sc){//nhap ma tran
//        for(int i=0; i<this.n; ++i){
//            for(int j=0; j<this.m; j++){
//               matrix[i][j] = sc.nextLong();
//            }
//        }
//    }
//    
//    public Matrix mul(Matrix o){//n hang, m cot
//        Matrix c = new Matrix(this.n, o.m);
//        for(int i=0; i<this.n; i++){
//            for(int j=0; j<o.m; j++){
//                long sum = 0;
//                for(int k=0; k<this.m; k++){
//                    sum += this.matrix[i][k] * o.matrix[k][j]; 
//                }
//                c.matrix[i][j] = sum;
//            }
//
//        }
//        return c;
//    }
//    @Override
//    public String toString(){
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        return "";
//    }
//}
//public class J04016_TichHaiDoiTuongMaTran {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
//        Matrix a = new Matrix(n,m);
//        a.nextMatrix(sc);
//        Matrix b = new Matrix(m,p);
//        b.nextMatrix(sc);
//        System.out.println(a.mul(b));
//    }
//}
///*
//3 4 3
//1 2 3 4
//4 2 3 1
//2 4 1 3
//1 1 1
//2 2 2
//3 3 3
//4 4 4
//*/