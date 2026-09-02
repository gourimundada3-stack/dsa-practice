public class countingStrings {
    public static void main(String[] args) {
        int n = 5;
        int []ans = new int[n+1];

        for (int i = 0; i <= n; i++) {
            String bin = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < bin.length(); j++) {
                if (bin.charAt(j) == '1') {
                    count++;
                }
            }
            ans[i] = count;
        }
           for(int i=0;i<n;i++){
               System.out.print(ans[i]+ " ");
        }
    }
}
