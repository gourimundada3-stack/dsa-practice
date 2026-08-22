import java.util.*;
public class Reaarangearray {
    public int[] rearrangewithsign(int []arr) {
        int n = arr.length;
        ArrayList<Integer> plist = new ArrayList<>();
        ArrayList<Integer> nlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                plist.add(arr[i]);
            } else {
                nlist.add(arr[i]);
            }
        }
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = plist.get(i);
            arr[2 * i + 1] = nlist.get(i);
        }
        return arr;
    }
    public static void main(String[]args){
        int []arr = {2,4,5,-1,-3,-4};
        Reaarangearray obj = new Reaarangearray();
        int []ans = obj.rearrangewithsign(arr);
        System.out.println(Arrays.toString(ans));

    }
}
