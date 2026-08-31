public class ispoweroftwo {
    public boolean poweroftwo(int n) {
        if ((n & (n - 1) )== 0) {
            return true;
        }
        return false;
    }

    public static void main(String[]args){
        int n=21;
        ispoweroftwo obj = new ispoweroftwo();
        boolean res = obj.poweroftwo(n);
        System.out.println(res);

        }
    }

