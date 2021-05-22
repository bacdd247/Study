import java.util.ArrayList;

public class Hehe {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        System.out.println("size = " + a.size());
        int size = a.size();
        for (int i = 0; i < size; i ++) {
            System.out.println("a[" + i + "] = " + a.get(i));
        }
    }
}
