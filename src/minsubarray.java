public class minsubarray {
    public int findminsubset(int[]arr){
        int n=arr.length;
        int minprod =arr[0];
        int maxprod = arr[0];
        int ans =arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<0){
                int temp = minprod;
                minprod = maxprod;
                maxprod = temp;
            }
            minprod = Math.min(arr[i],minprod*arr[i]);
            maxprod = Math.min(arr[i],minprod*arr[i]);
            ans = Math.min(minprod,ans);
        }
        return ans;
    }
    public static void main(String[]args){
        int []arr ={4,-2,5};
        minsubarray obj2 = new minsubarray();
        int result = obj2.findminsubset(arr);
        System.out.println(result);

    }
}
