package HinhHoc;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){}
    public HinhVuong(double side){
        super(side, side);
    }
    public HinhVuong(double side,String color, boolean filled){
        super (side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLength(double length){
        setSide(length);
    }
    @Override
    public String toString(){
        return "Hình vuông có cạnh = "
                + getSide()
                + "; Là lớp con của lớp "
                + super.toString();
    }
}
