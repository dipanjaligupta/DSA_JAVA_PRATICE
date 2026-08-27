import java.util.*;

public class Triplate {
    public static void uniqueTriplate(int n[]) {

        for(int i = 0; i < n.length; i++) {

            for(int j = i + 1; j < n.length; j++) {

                for(int k = j + 1; k < n.length; k++) {

                    if(n[i] + n[j] + n[k] == 0) {

                        System.out.println(
                            "[" + n[i] + ", " + n[j] + ", " + n[k] + "]"
                        );
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int n[] = {-1, 0, 1, 2, -1, -4};

        uniqueTriplate(n);
    }
}