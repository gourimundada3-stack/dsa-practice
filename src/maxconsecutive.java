public class maxconsecutive {
    public int findmax1(int []arr){
        int count = 0;
        int n=arr.length;
        int max = 0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                max = Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;


    }
    public static void main(String[]args){
    int []arr = {1,1,0,0,1,1,1,0};
    maxconsecutive obj2 =new maxconsecutive();
    int result  = obj2.findmax1(arr);
        System.out.println(result);
    }
}
