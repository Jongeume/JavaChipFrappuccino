package jungseok.Ch03;

public class OperatorEx3 {
    public static void main(String[] args) {

        //후위증감식 i++
        int i = 5;
        System.out.printf("(1) i++ : %d%n", i++);

        System.out.printf("(2) i++ : %d%n", i);

        //전위증감식 ++i
        i = 5;
        System.out.printf("++i : %d%n", ++i);

        //전위증감식
        int j = 5;
        j = j + 1;
        System.out.printf("j : %d%n", j);


        //후위증감식
        i = 5;
        final int t = i;
        i = i + 1;
        System.out.printf("t : %d%n", t);
    }
}
