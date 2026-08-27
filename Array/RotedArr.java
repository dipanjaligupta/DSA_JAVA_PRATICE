public class RotedArr {
    public static int RotedArrEle(int n[], int key) {
        int first = 0;
        int last = n.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            // Target mil gaya
            if (n[mid] == key) {
                return mid;
            }

            // Left half sorted hai
            if (n[first] <= n[mid]) {

                // Target left range me hai
                if (key >= n[first] && key < n[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }

            }
            // Right half sorted hai
            else {

                // Target right range me hai
                if (key > n[mid] && key <= n[last]) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n[] = {4, 5, 6, 7, 0, 1, 2};
        int key = 0;

        System.out.println(RotedArrEle(n, key));
    }
}