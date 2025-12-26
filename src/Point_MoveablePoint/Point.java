package Point_MoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    // constructor
    public Point() {
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    // get, set x
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    // get, set y
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

}
