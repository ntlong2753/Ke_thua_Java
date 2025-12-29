package HinhHoc;

import java.util.Arrays;

public class TestCircleComparable {
    public static void main(String[] args) {
        CircleComparable[] soSanh = new CircleComparable[3];
        soSanh[0] = new CircleComparable(3);
        soSanh[1] = new CircleComparable();
        soSanh[2] = new CircleComparable(4, "xanh", false);

        System.out.println("Giá trị ban đầu: ");
        for (CircleComparable hinhTronSoSanh : soSanh) {
            System.out.println(hinhTronSoSanh);
        }
        System.out.println("-------------------------");

        Arrays.sort(soSanh);
        System.out.println("Sau khi sắp xếp: ");
        for (CircleComparable hinhTronSoSanh : soSanh) {
            System.out.println(hinhTronSoSanh);
        }
    }
}
