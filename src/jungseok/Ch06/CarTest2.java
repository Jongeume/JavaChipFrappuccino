package jungseok.Ch06;

class CarTest2 {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car("blue"); // 새로운 인스턴스 생성 후 주소 참조.
        Car c3 = new Car(c1); // c1의 인스턴스 주소를 복사 후 참조.



        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
        System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType + ", door=" + c3.door);

        c1.door = 6;
        System.out.println("c1의 인스턴스 변수 door 값 변경 후.");
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType + ", door=" + c3.door);
    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car() {

        this("white", "auto", 4);
    }
    Car(String color) {

        this(color, "auto", 4);
    }
    /*    Car(String color, String gearType, int door) {

            color = color;
            gearType = gearType;
            door = door;
        }*/
    Car(String color, String gearType, int door) {

        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(Car c) {

        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
}