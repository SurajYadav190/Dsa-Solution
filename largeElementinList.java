import java.util.*;;
public class largeElementinList {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(25);
        // list.add(5);
        // list.add(40);
        // list.add(30);

        List<Integer> list = Arrays.asList(10, 25, 5, 40, 30,90,35,95,134);
        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("Largest number: " + max);
    }
}