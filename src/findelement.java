public class findelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};

        System.out.println(linearsearch(arr, 0, 4));

    }

    static int linearsearch(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return linearsearch(arr, index + 1, target);

        }
    }
}
