import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> outList = new ArrayList<>();
        for (int i : intList) {
            if (i > 0 && i % 2 == 0) {
                outList.add(i);
            }
        }
        outList.sort(Comparator.naturalOrder());
        for (int i : outList) {
            System.out.print(i + " ");
        }
    }
}
