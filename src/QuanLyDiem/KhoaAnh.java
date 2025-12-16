package QuanLyDiem;

public class KhoaAnh extends NamHoc2025{
    public KhoaAnh(String ten, String cccd) {
        super(ten, cccd);
    }
    //override

    @Override
    public void tinhDTB() {
        System.out.println("đây là phương thức của khoa anh");
    }
}















