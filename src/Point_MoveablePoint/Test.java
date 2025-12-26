package Point_MoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println(p1);
        MoveablePoint p2 = new MoveablePoint(1.0f, 2.0f, 0.5f, 1.0f);
        p2.move();
        System.out.println(p2);
    }
}
