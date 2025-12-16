package TestInterface;

public interface Viduinterface {
    // tập các thuộc tính (chỉ được phép là hằng số)
    static final double phuCap = 15; //15$
    // các phương thức, phải là trừ tượng
    public abstract void thongTin(String ten, String cccd, int namSinh);
    public abstract double tinhLuong (double luongNgay, int soNgayCong);
}
