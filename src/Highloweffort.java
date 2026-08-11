public class Highloweffort {
    public int findeffort(int[]l,int[]h) {
        int noTask = 0;
        int task = 0;

        for (int i = 0; i < h.length; i++) {

            // Purani values se calculate karo
            int bestPrevious = Math.max(noTask, task);

            // Aaj kuch nahi kiya
            int newNoTask = bestPrevious;

            // Aaj low-effort kiya
            int low = bestPrevious + l[i];

            // Aaj high-effort kiya
            // Kal koi task nahi kiya hona chahiye
            int high = noTask + h[i];

            // Aaj task kiya
            int newTask = Math.max(low, high);

            // Sab calculations ke BAAD update karo
            noTask = newNoTask;
            task = newTask;
        }

        return Math.max(noTask, task);
    }


    public static void main(String[]args){
        int []l = {2,8,1};
        int []r = {1,2,1};
        Highloweffort obj = new Highloweffort();
        int res = obj.findeffort(l,r);
        System.out.println(res);

    }
}
