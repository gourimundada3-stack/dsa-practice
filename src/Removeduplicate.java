public class Removeduplicate {
    public int Countduplicate(int[]arr){
      int n=arr.length;
      int count = 0;
      for(int i=0;i<n-1;i++){
          if(arr[i]!=arr[i+1]){
              count++;
          }
      }
      return count;
    }
    public static void main(String[]args){
      int []arr = {-2, 2, 4, 4, 4, 4, 5, 5};
      Removeduplicate obj = new Removeduplicate();
      int ans = obj.Countduplicate(arr);
      int finalans = ans +1;
        System.out.println(finalans);
    }
}
