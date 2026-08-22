public class Kadanealgo {
    public int KA(int[]arr){
        int n=arr.length;
        int sum = arr[0];
        int max = arr[0];
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum>max){
                max = sum;
            }
            if(sum <0){
                sum =0;
            }

        }
        return max;
    }
    public static void main(String[]args){
        int []arr = {2,3,-8,7,-1,2,3};
        Kadanealgo obj3 = new Kadanealgo();
        int res = obj3.KA(arr);
        System.out.println(res);

    }
}
