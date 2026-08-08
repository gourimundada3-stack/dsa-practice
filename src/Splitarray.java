import java.util.ArrayList;
import java.util.Arrays;

public class Splitarray {

    public void splitarray(int[] arr) {

        Arrays.sort(arr);

        ArrayList<Integer> subset = new ArrayList<>();
        subset.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1] + 1) {
                subset.add(arr[i]);
            } else {
                // Print completed subset
                System.out.println(subset);

                // Start new subset
                subset = new ArrayList<>();
                subset.add(arr[i]);
            }
        }

        // Print the last subset
        System.out.println(subset);
    }

    public static void main(String[] args) {
        int[] arr = {100,56,5,6,102,58,101,57,7,103,59};

        Splitarray obj = new Splitarray();
        obj.splitarray(arr);
    }
}