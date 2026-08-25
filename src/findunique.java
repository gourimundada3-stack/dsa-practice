public class findunique {
    public int reverse(int n){
        int revno = 0;
        while(n>0){
            int lastdigit = n%10;
            revno = revno* 10 + lastdigit;
            n = n/10;
        }
        return revno;
    }
    public static void main(String[]args){
        int n = 120;
        findunique obj = new findunique();
        int ans = obj.reverse(n);
        System.out.println(ans);
    }
}
