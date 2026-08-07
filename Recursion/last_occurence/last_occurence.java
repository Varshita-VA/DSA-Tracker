public class last_occurence {
    public static int last(int arr[], int key, int i) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return last(arr, key, i - 1);
    }

    public static void main(String args[]) {
        int arr[] = {4, 5, 5, 3, 2, 1, 5, 2};
        System.out.println(last(arr, 5, arr.length - 1));
    }
}