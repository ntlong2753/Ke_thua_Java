package HinhHoc;

public class TestHinhTron {
    public static void main(String[] args) {
        HinhTron hinhTron1 = new HinhTron();
        System.out.println(hinhTron1);
        HinhTron hinhTron2 = new HinhTron(2.5);
        System.out.println(hinhTron2);
        HinhTron hinhTron3 = new HinhTron(3.5, "vàng", false);
        System.out.println(hinhTron3);
    }
}
