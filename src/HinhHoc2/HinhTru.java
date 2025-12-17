package HinhHoc2;

public class HinhTru extends HinhTron{
    private double chieuCao;
    public HinhTru() {

    }
    public HinhTru(double chieuCao, double banKinh, String mauSac) {
        super (banKinh, mauSac);
        this.chieuCao = chieuCao;
    }
    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double getDienTichXungQuanh() {
        return super.getBanKinh() * 2 * Math.PI * chieuCao;
    }
    public double getDienTichToanPhan() {
        return super.getDienTich() * 2 * getDienTichXungQuanh();
    }
    public double getTheTich(){
        return super.getDienTich() * chieuCao;
    }

    public String toString(){
        return "Đáy hình trụ có bán kính = " + getBanKinh() +
                "\nDiện tích đáy hình trụ = " + getDienTich() +
                "\nMàu sắc hình trụ là: " + getMauSac() +
                "\nThể tích hình trụ = " + getTheTich();
    }
}
