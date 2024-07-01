
package UngDungJavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class JKT013_SoLocPhat {
    public static ArrayList<String> arr = new ArrayList<>();
    public static void init(){
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        arr.add("6");
        arr.add("8");
        while(true){
            String top = q.poll();
            if(top.length() == 15) break;
            q.add(top + "6");
            q.add(top + "8");
            arr.add(top + "6");
            arr.add(top + "8");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        init();
        while(t-- >0){
            int n = sc.nextInt();
            ArrayList<String> b = new ArrayList<>();
            for(int i=0; i<arr.size(); i++){
                if(arr.get(i).length() <= n){
                    b.add(arr.get(i));
                }
            }
            System.out.println(b.size());
            for(int i = b.size() - 1; i>=0; i--){
                System.out.printf("%s ", b.get(i));
            }
            System.out.println("");
        }
    }
}
