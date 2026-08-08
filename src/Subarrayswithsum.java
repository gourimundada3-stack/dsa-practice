public class Subarrayswithsum {
    public int countsum(int[]arr,int l,int r) {
        long countR = 0, countL = 0;
        long sum = 0;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > r) {
                sum -= arr[left++];
            }
            countR += (right - left + 1);
        }
        sum = 0;
        left = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > l - 1) {
                sum -= arr[left++];
            }
            countL += (right - left + 1);
        }
        return (int)(countR - countL);
    }

    public static void main(String[]args){
    int []arr = {1,4,6};
    int l = 3;
    int r = 8;
    Subarrayswithsum obj1 = new Subarrayswithsum();
    int ans = obj1.countsum(arr,l,r);
        System.out.println(ans);
    }
}
