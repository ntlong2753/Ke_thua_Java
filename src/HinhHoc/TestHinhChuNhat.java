package HinhHoc;

public class TestHinhChuNhat {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        System.out.println(hcn1);
        HinhChuNhat hcn2 = new HinhChuNhat(1, 2);
        System.out.println(hcn2);
        HinhChuNhat hcn3 = new HinhChuNhat(3, 4, "cam", false);
        System.out.println(hcn3);

    }
}
