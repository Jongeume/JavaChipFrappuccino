package jungseok.Ch04;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {

        int[] numArr = new int[10];
        int[] counter = new int[10];
        /*for (int i = 0; i < counter.length; ++i)
            System.out.print(counter[i]);*/
        for (int i = 0; i < numArr.length; ++i) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < numArr.length; ++i) {
            counter[numArr[i]]++;
        }

        // 일반 for 문
        for (int i = 0; i < counter.length; ++i) {
            System.out.println( i +"의 갯수 : " + counter[i] + "개");
        }
        // 향상된 for문
        /*
        for (int i : counter) {
            System.out.println("counter " + i);
        }
        */
    }
}
