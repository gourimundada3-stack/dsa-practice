import java.util.Arrays;

public class pairK {
    public int  Checkdiff(int[]arr,int k){
        int n=arr.length;
        Arrays.sort(arr);
        int count =0;
        int i=0;
        int j=1;
            while(j<n){
                if(arr[j]-arr[i]<k) {
                    count += (j - i);
                    j++;
                }
                else {
                    i++;
                if(i==j){
                    j++;
                }
            }
        }
        return count;
    }
    public static void main(String[]args){
    int []arr = {1,10,4,2};
    int k = 3;
    pairK obj = new pairK();
    int ans = obj.Checkdiff(arr,k);
        System.out.println(ans);
    }
}
