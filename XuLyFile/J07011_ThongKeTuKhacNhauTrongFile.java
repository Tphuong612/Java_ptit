
package XuLyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J07011_ThongKeTuKhacNhauTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
        for(int i=0; i<n; i++){
            String s = sc.nextLine().trim().toLowerCase();
            String word[] = s.trim().split("[ +,.?!:;()/-]");
           
            for(String j: word){
                if(lm.containsKey(j.trim())) lm.put(j.trim(), lm.get(j)+1);
                else lm.put(j.trim(), 1);
            }
        }
        ArrayList<Map.Entry<String, Integer>> arr = new ArrayList<>(lm.entrySet());
        //Collections.sort(arr, (Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) -> -Integer.compare(o1.getValue(), o2.getValue()));
        Collections.sort(arr, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                if(!o1.getValue().equals(o2.getValue())){
                    return -Integer.compare(o1.getValue(), o2.getValue());
                }
                else return o1.getKey().compareTo(o2.getKey());
                
            }
        });
//        Collections.sort(arr, (Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) -> {
//            if(!o1.getValue().equals(o2.getValue())){
//                return -Integer.compare(o1.getValue(), o2.getValue());
//            }
//            else return o1.getKey().compareTo(o2.getKey());
//        });
        for(Map.Entry<String, Integer> i: arr){
            System.out.println(i.getKey()+" "+i.getValue());
        }
       
    }
}
