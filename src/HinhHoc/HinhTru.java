package HinhHoc;

public class HinhTru extends HinhTron {
    private double height;
    public HinhTru(){}
    public HinhTru(double height){
        this.height = height;
    }
    public HinhTru(double height,double radius){
        super(radius);
        this.height = height;
    }
    public HinhTru(double height,double radius, String color, boolean filled){
        super (radius, color, filled);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Hình trụ có chiều cao = "
                + getHeight()
                + " và bán kính đáy bằng = "
                + getRadius()
                + "; Là lớp con của lớp "
                + super.toString();
    }
}
