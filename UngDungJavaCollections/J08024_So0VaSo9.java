
package UngDungJavaCollections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class J08024_So0VaSo9 {
    public static ArrayList<String> arr = new ArrayList<>();
    public static void init(){
        Queue<String> q = new LinkedList<>();   
        q.add("9");
        arr.add("9");
        while(arr.size()<=10000){
            String top = q.poll();
           
            q.add(top + "0");
            q.add(top + "9");
            arr.add(top+"0");
            arr.add(top+"9");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        init();
        while(t-- >0){
            long n = sc.nextLong();
            for(String i: arr){
                Long a = Long.valueOf(i);
                if(a%n==0){
                    System.out.println(a);
                    break;
                }
            }
            
        }
    }
}
