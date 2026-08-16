public class Longestsubaaray {
    public int findsubarray(int[]arr,int w) {
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                    if (sum == k) {
                        len = Math.max(len, j - i + 1);
                    }
                }
            }

        }
        return len;
    }
    public static void main(String[]args){
      int []arr ={10,5,2,7,1,9};
      int w=15;
      Longestsubaaray obj = new Longestsubaaray();
      int ans = obj.findsubarray(arr,w);
        System.out.println(ans);
    }
}
