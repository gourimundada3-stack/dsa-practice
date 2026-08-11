import java.util.Arrays;

public class missingnumber {
    public int findno(int[]arr){
        int n=arr.length+1;
        int[]hash = new int[n+1];
        for(int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int []arr = {0,2,3,1,4};
        missingnumber obj = new missingnumber();
        int result = obj.findno(arr);
        System.out.println(result);


    }

}
