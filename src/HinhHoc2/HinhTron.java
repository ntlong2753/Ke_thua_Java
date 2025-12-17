package HinhHoc2;

public class HinhTron {
    private double banKinh;
    private String mauSac;

    // tạo constructor
    public HinhTron(){

    }
    public HinhTron(double banKinh, String mauSac){
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }
    // get
    public double getBanKinh(){
        return banKinh;
    }
    public String getMauSac(){
        return mauSac;
    }
    // set
    public void setBanKinh(double banKinh){
        this.banKinh = banKinh;
    }
    public void setMauSac(String mauSac){
        this.mauSac = mauSac;
    }
    // diện tích
    public double getDienTich(){
        return banKinh * banKinh * Math.PI;
    }
    // chu vi
    public double getChuVi(){
        return 2 * Math.PI * this.banKinh;
    }
    // toString
    public String toString(){
        return "Hình tròn có bán kính = " + banKinh +
                "\nDiện tích hình tròn = " + getDienTich() +
                "\nMàu sắc hình tròn là: " + mauSac;
    }
}

