package jungseok.Ch04;

public class ArrayEx3 {
    public static void main(String[] args) {

        char[] abc = {'A', 'B', 'C', 'D', 'E'};
        char[] ABC = {'a', 'b', 'c', 'd', 'e'};
        char[] num = new char[10];
        for (int i = 0; i < num.length; ++i) {
            num[i] = (char) (48 + i);
        }
        System.out.println(num);

        System.out.println(abc);
        System.out.println(ABC);
        System.out.println();
        char[] result = new char[abc.length + ABC.length];
        System.arraycopy(abc, 0, result, -0, abc.length);
        System.arraycopy(ABC, 0, result, abc.length, ABC.length);
        for (int i = 0; i < result.length; ++i) {
            System.out.println("result[" + i + "] : " + result[i]);
        }


        System.out.println();
        System.arraycopy(abc, 0, num, 5, abc.length);
        System.out.println(num);
        System.out.println();
        System.arraycopy(ABC,0,num, 2, 3);
        System.out.println(num);
    }
}
