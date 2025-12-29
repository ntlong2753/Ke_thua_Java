package HinhHoc;

import java.util.Arrays;
import java.util.Comparator;

public class TestCircleComparator {
    public static void main(String[] args) {
        HinhTron[] circles = new HinhTron[3];
        circles[0] = new HinhTron(3.6);
        circles[1] = new HinhTron();
        circles[2] = new HinhTron(3.5, "xanh", false);

        System.out.println("Giá trị ban đầu: ");
        for (HinhTron circle : circles) {
            System.out.println(circle);
        }
        System.out.println("-----------------------");

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,  circleComparator);

        System.out.println("Giá trị sau khi sắp xếp");
        for (HinhTron circle : circles) {
            System.out.println(circle);
        }
    }
}
