import java.util.Arrays;
public class zerotoend {
     void movezero(int[]arr){
        int n=arr.length;
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count<n){
            arr[count++] = 0;
        }
    }
    public static void main(String[]args){
        int []arr ={0,1,4,0,5,2};
        zerotoend obj = new zerotoend();
         obj.movezero(arr);
        System.out.println(Arrays.toString(arr));
     }
}
