import java.util.ArrayList;
import java.util.Collections;

 public class twosorteedarray {
    public ArrayList<Integer> unionarray(int[] arr, int[] arr1) {
        ArrayList<Integer> set1 = new ArrayList<>();
        for (int num : arr) {
            set1.add(num);
        }
        for (int num : arr1) {
            if (!set1.contains(num)) {
                set1.add(num);
            }
        }
        Collections.sort(set1);

        return set1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 7};
        twosorteedarray obj = new twosorteedarray();
        ArrayList<Integer> ans = obj.unionarray(arr, arr1);
        System.out.println(ans);
    }
}