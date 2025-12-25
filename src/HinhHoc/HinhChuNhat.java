package HinhHoc;

public class HinhChuNhat extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public HinhChuNhat(){}
    public HinhChuNhat(double width, double length){
        this.width = width;
        this.length = length;
    }
    public HinhChuNhat(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    // width
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    // length
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    // diện tích
    public double getDienTich(){
        return this.width * this.length;
    }
    // chu vi
    public double getChuVi(){
        return (this.width + this.length) * 2;
    }
    @Override
    public String toString() {
        return "Hình chữ nhật có chiều rộng = " + getWidth()
                + " và chiều dài = " + getLength()
                + "; Có diện tích = " + getDienTich()
                + " và chu vi = " + getChuVi()
                + "; Là lớp con của lớp "
                + super.toString();
    }

}
