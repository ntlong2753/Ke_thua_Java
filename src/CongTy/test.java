package CongTy;

public class test {
    public static void main(String[] args) {
        /*NhanVien nv1 = new NhanVien("nhân viên 1", "HN", 123456789);
        double luongnv1 = nv1.tinhLuong();
        System.out.println("lương nv1: " + luongnv1);*/

        // tạo đối tượng nhân viên hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hành chính 1", "hn", 133909);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("lương hc1: " + luonghc1);

        // tạo đối tượng nv đi ca
        NhanVienDiCa ca1 = new NhanVienDiCa("ca", "hn", 1111);
        double ca1luong = ca1.tinhLuong();
        System.out.println("lương ca1: " + ca1luong);

        NhanVienDiCa ca2 = new NhanVienDiCa("ca2", "hn", 1111, 1);
        double ca2luong = ca2.tinhLuong();
        System.out.println("lương c2: " + ca2luong);
        System.out.println(ca2.ca);
    }
}














