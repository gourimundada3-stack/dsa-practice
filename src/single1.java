public class single1 {
    public int  findsingle(int[]arr){
        int n=arr.length;
        int ans =0;
        for(int i=0;i<n;i++){
           ans ^= arr[i];
        }
        return ans;
    }
    public static void main(String[]args){
        int []arr ={1,2,2,4,3,1,4};
        single1 obj = new single1();
        int res = obj.findsingle(arr);
        System.out.println(res);

    }
}
