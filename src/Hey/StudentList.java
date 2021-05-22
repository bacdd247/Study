package Hey;
import java.util.ArrayList;


public class StudentList {
    public static void main(String[] args) {
        Student bac = new Student(1, "Bac", 10, 10, 10 );
        Student khoi = new Student(2, "Khoi", 6, 7,6.5f);
        Student chung = new Student(3, "Chung", 10, 0,9);
        Student trung = new Student(4, "Trung", 8, 7,9);
        Student hoa = new Student(5, "Hoa", 2, 3,4);

        ArrayList<Student> stu = new ArrayList<>();
        stu.add(bac);
        stu.add(khoi);
        stu.add(chung);
        stu.add(trung);
        stu.add(hoa);
        for (Student a : stu) {
            System.out.println("Id: " + a.getId() + ", ten: " + a.getName() + ", diem Toan: " + a.getDiemToan() + ", diem Van: " + a.getDiemVan() + ", diem Anh: " + a.getDiemAnh());
        }

        System.out.println("----------------------");
        for (Student a : stu) {
            float b = (a.getDiemToan() + a.getDiemAnh() + a.getDiemVan())/3;
            a.setdiemTb(b);
            System.out.println("Id: " + a.getId() + ", ten: " + a.getName() + ", diem trung binh: " + a.getdiemTb());
        }

        System.out.println("----------------------");
        for (Student a : stu) {
            if (a.getDiemToan() == 0 || a.getDiemVan() == 0 || a.getDiemAnh() == 0 ) {
                System.out.println("Id: " + a.getId() + ", ten: " + a.getName() + ", xep loai yeu");
            } else if (a.getdiemTb() >= 5 && a.getdiemTb() < 7) {
                    System.out.println("Id: " + a.getId() + ", ten: " + a.getName() + ", xep loai trung binh");
                } else if (a.getdiemTb() >= 7 && a.getdiemTb() < 9) {
                    System.out.println("Id: " + a.getId() + ", ten: " + a.getName() + ", xep loai kha");
                } else if (a.getdiemTb() >= 9) {
                    System.out.println("Id: " + a.getId() + ", ten: " + a.getName() + ", xep loai gioi");
                } else {
                    System.out.println("Id: " + a.getId() + ", ten: " + a.getName() + ", xep loai yeu");
                }
            }
        }

    }

