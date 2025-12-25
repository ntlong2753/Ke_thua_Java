package HinhHoc;

public class Shape {
    private String color = "xanh";
    private boolean filled= true;

    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // filled
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return  "Hình dạng có màu " + getColor() +
                " và " + ((isFilled()) ? "đã tô màu" : "chưa tô màu");
    }
}
