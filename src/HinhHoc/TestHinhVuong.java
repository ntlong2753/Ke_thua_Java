package HinhHoc;

public class TestHinhVuong {
    public static void main(String[] args) {
        HinhVuong hv1 = new HinhVuong();
        System.out.println(hv1);
        HinhVuong hv2 = new HinhVuong(2);
        System.out.println(hv2);
        HinhVuong hv3 = new HinhVuong(2,"xanh", true);
        System.out.println(hv3);
    }
}
