import java.util.ArrayList;

public class Hihu {
    public static void main(String[] args) {
        String nv1 = "123;Bac;1000;Nam";
        String nv2 = "145;Bac1;1500;Nu";
        String nv3 = "168;Bac2;900;Nam";
        String nv4 = "192;Bac3;2000;Nu";
        String nv5 = "205;Bac4;1300;Nam";
        ArrayList<String> dsnv = new ArrayList<>();
        dsnv.add(nv1);
        dsnv.add(nv2);
        dsnv.add(nv3);
        dsnv.add(nv4);
        dsnv.add(nv5);
        int size = dsnv.size();

        ArrayList<String> id = new ArrayList<>();
        ArrayList<String> ten = new ArrayList<>();
        ArrayList<String> luong = new ArrayList<>();
        ArrayList<String> gioitinh = new ArrayList<>();

        for (String a : dsnv) {
            String[] b = a.split(";");
            id.add(b[0]);
            ten.add(b[1]);
            luong.add(b[2]);
            gioitinh.add(b[3]);
        }

        for (int i = 0; i < size; i++) {
            System.out.println(id.get(i)+" - "+ten.get(i)+" - "+luong.get(i)+"$ - "+gioitinh.get(i));
        }
    }
}

