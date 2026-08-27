import java.util.ArrayList;

public class LonelyNumEx{

    public static ArrayList<Integer> findLonely(ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = list.size();

        for (int i = 0; i < n; i++) {

            int count = 0;
            boolean hasPrev = false;
            boolean hasNext = false;

            for (int j = 0; j < n; j++) {

                // Frequency Count
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }

                // x - 1 present?
                if (list.get(j) == list.get(i) - 1) {
                    hasPrev = true;
                }

                // x + 1 present?
                if (list.get(j) == list.get(i) + 1) {
                    hasNext = true;
                }
            }

            if (count == 1 && !hasPrev && !hasNext) {
                ans.add(list.get(i));
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println(findLonely(list));
    }
}