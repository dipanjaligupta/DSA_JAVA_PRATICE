import java.util.*;

public class LinearSearch {

    public static int linearS(int nums[], int key) {

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int nums[] = {2, 4, 4, 2, 10, 4, 8};
        int key = 1;

        int index = linearS(nums, key);

        if(index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Key is found at index " + index);
        }
    }
}