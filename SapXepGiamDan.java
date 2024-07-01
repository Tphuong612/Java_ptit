import java.util.Arrays;
import java.util.Collections;

public class SapXepGiamDan {
    public static void main(String[] args) {
        // Tạo một mảng ví dụ
        Integer[] mang = {5, 2, 8, 1, 6};

        // Sắp xếp mảng giảm dần sử dụng Arrays.sort
        Arrays.sort(mang, Collections.reverseOrder());

        // In ra mảng sau khi đã sắp xếp
        System.out.println("Mảng sau khi sắp xếp giảm dần: " + Arrays.toString(mang));
    }
}
