package Hey;

public class Student {
    int id;
    String name;
    float diemToan;
    float diemVan;
    float diemAnh;
    float diemTb;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    public float getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(float diemAnh) {
        this.diemAnh = diemAnh;
    }

    public float getdiemTb() {
        return diemTb;
    }

    public void setdiemTb(float diemTb) {
        this.diemTb = diemTb;
    }

    public Student(int id, String name, float diemToan, float diemVan, float diemAnh) {
        this.id = id;
        this.name = name;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
        this.diemTb = diemTb;
    }
}
