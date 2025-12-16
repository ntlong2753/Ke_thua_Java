package QuanLyDiem;

public class testDiem {
    public static void main(String[] args) {
        // khởi tạo đối tượng
        KhoaToan toan1 = new KhoaToan("hachimi", "123456");
        toan1.tinhDTB();


        KhoaAnh anh1 = new KhoaAnh("mambo", "789012");
        anh1.tinhDTB();

        KhoaVan van1 = new KhoaVan("mambohachimi", "123456098");
        van1.tinhDTB();
    }
}











