package HinhHoc2;

public class testHinhHoc2 {
    public static void main(String[] args) {
        // test HinhTron
        HinhTron hinhTron = new HinhTron();
        hinhTron = new HinhTron(2, "Xanh");
        System.out.println(hinhTron);
        System.out.println("----------------------------------------");
        // test HinhTru
        HinhTru hinhTru = new HinhTru();
        hinhTru = new HinhTru(2, 2, "Xanh");
        System.out.println("Thể tích hình trụ = " + hinhTru);
    }
}
