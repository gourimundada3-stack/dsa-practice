public class sortarray {
     boolean issorted(int []arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            }
        return true;
        }
    public static void main(String[]args){
            int [] arr = {1, 2, 3, 4, 5};
            sortarray s1 = new sortarray();
            boolean ans = s1.issorted(arr);
        System.out.println(ans);

        }
}
