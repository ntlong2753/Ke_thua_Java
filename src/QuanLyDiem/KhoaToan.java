package QuanLyDiem;

public class KhoaToan extends NamHoc2025{
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }
    //override
    @Override
    public void tinhDTB() {
        System.out.println("đây là phương thức của khoa toán");
    }
}










