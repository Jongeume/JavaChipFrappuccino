package jungseok.Ch07;


public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

class Point1 {
    int x, y;
    Point1(){
        this.x = 1;
        this.y = 2;
    }
    Point1(int x, int y) {

        this.x = x;
        this.y = y;
    }

    String getLocation() {

        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point1 {
    int z;

    Point3D(int x, int y, int z) {

        super(); // 컴파일 에러 발생.
        this.x = x;
        this.y = y;
        this.z = z;
    }
    String getLocation() {

        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}
