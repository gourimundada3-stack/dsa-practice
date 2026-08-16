import java.util.Arrays;

public class twosum {
    public int[] finssum(int[]arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};

    }
    public static void main(String[]args){
        int []arr = {1,6,2,10,3};
        int target = 7;
        twosum obj1 = new twosum();
        int []ans = obj1.finssum(arr,target);
        System.out.println(Arrays.toString(ans));

    }
}
