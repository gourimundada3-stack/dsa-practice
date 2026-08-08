public class fibonaccinumber {
    public int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);


    }
      public static void main(String[]args){
          int n=0;
          fibonaccinumber obj = new fibonaccinumber();
          int ans = obj.fibo(n);
          System.out.println(ans);
      }
}
