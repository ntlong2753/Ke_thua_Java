package HinhHoc;

public class TestHinhTru {
    public static void main(String[] args) {
        HinhTru hinhTru1 = new HinhTru();
        System.out.println(hinhTru1);
        HinhTru hinhTru2 = new HinhTru(2,3);
        System.out.println(hinhTru2);
        HinhTru hinhTru3 = new HinhTru(4,5,"xanh", false);
        System.out.println(hinhTru3);
    }
}
