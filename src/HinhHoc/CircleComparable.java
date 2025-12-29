package HinhHoc;

public class CircleComparable extends HinhTron
        implements Comparable <CircleComparable> {
    public CircleComparable() {
        super();
    }
    public CircleComparable(double radius){
        super(radius);
    }
    public CircleComparable(double radius, String color, boolean filled) {
        super(radius,color, filled);
    }
    @Override
    public int compareTo(CircleComparable o) {
        if (this.getRadius() < o.getRadius()) {
            return -1;
        }
        else if (this.getRadius() > o.getRadius()) {
            return 1;
        }
        else return 0;
    }
}
