package jungseok.Ch07;

public class PointTest2 {
    public static void main(String[] args) {

        Point3D_1 p3 = new Point3D_1(); // 1.Point3D_1() 생성자 호출
        // 8. 종료
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class Point2 {
    int x = 10, y = 20;

    Point2(int x, int y) { // 4. 매개변수 => 인스턴스변수 값 변경

        this.x = x;
        this.y = y;
    }// 5. Point2(int x, int y) 종료
}

class Point3D_1 extends Point2 {
    int z = 30;
    Point3D_1() {

        this(100, 200, 300); // 2. Point3D_1(int x, int y, int z) 호출
        // 7. Point3D_1() 종료
    }

    Point3D_1(int x, int y, int z) {

        super(x, y); // 3. Point2(int x , int y) 호출
        this.z = z; // 6. Point3D_1(int x, int y, int z) 종료
    }
}
