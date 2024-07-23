package jungseok.Ch06;


public class CardTest {
    public static void main(String[] args) {

        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card(); // Card 인스턴스 선언 + 생성 -> 참조변수 c1이 Card 인스턴스의 주소를 참조한다. = 인스턴스 c1
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card(); // c2는 새로운 Card 인스턴스를 선언 + 생성, 인스턴스의 주소를 참조함. = 인스턴스 c2
        c2.kind = "Space";
        c2.number = 4;


        printCard(c1, c2);
        /*printC1(c1);
        printC2(c2);*/
     /*   System.out.println("c1 은" + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2 은" + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");*/

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;


        printCard(c1, c2);
    /*    System.out.println("c1 은" + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2 은" + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");*/
        /*printC1(c1);
        printC2(c2);*/
    }
    static void printCard(Card c1, Card c2) {

        System.out.println("c1 은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2 은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    }

    static void printC1(Card c1) {

        System.out.println("c1 은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
    }
    static void printC2(Card c2) {

        System.out.println("c2 은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    }
}

class   Card {
    static int width = 100; // 클래스 변수
    static int height = 250;  // 클래스 변수
    String kind; // 인스턴스 변수
    int number; // 인스턴스 변수
}

