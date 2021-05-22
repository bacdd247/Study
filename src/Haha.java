import java.util.ArrayList;
import java.util.Scanner;

public class Haha {
    public static void main(String[] args) {
        Scanner input;
        int b;
        ArrayList<String> city = new ArrayList<>();
        city.add("Ban nhap trung ten thanh pho roi, cac thanh pho da nhap: ");
        do {
            System.out.print("Nhap ten thanh pho cua Viet Nam: ");
            input = new Scanner(System.in);
            String a = input.nextLine();

            if (!city.contains(a)) {
                city.add(a);
                 b = 1;
            } else {
                b = 0;
            }
        }   while (b == 1);
        for (String s : city) {
            System.out.println(s);
        }
    }
}
