public class powerofx {
    public static void main(String[]args){
        int n = 3;
        int power = 4;
        int i=1;
        int prod = 1;
        while(i<=power){
            prod *= n;
            i++;
        }
        System.out.println(prod);
    }
}
