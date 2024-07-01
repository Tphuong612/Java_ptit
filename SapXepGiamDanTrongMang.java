
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
/**
 * CollectionsExample4 class
 * 
 * @author viettuts.vn
 */
public class SapXepGiamDanTrongMang {
    public static void main(String args[]) {
        // create list
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        // sort list
        Collections.sort(list, (String o1, String o2) -> o2.compareTo(o1));
        // show list
        for (String element : list) {
            System.out.println(element);
        }
    }
}
/*  Sap xep 1 ArrayList của 1 ArrayList;
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    Collections.sort(arr, new Comparator<ArrayList<Integer>>() {
    @Override
    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2){
        // Sử dụng compareTo để so sánh các ArrayList
        return o1.toString().compareTo(o2.toString());
        }
    });
*/