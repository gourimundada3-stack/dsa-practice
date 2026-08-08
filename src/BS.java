public class BS {
    public static void main(String[]args){
        int []arr = {4,53,1,67,8,90};
        int target = 1;
        int s=0;
        int e=arr.length;
        System.out.println(BSrecursion(arr,target,s,e));
    }
    public static int BSrecursion(int[]arr,int target,int s,int e){
        int n=arr.length;
        int m= s+(e-s)/2;
        if(target == arr[m]){
            return m;
        }
        if(target<m){
            return BSrecursion(arr,target,s,m-1);
        }
        else{
            return BSrecursion(arr,target,m+1,e);
        }

    }

}
