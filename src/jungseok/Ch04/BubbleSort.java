package jungseok.Ch04;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; ++i) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }

        for (int i = 0; i < numArr.length - 1; ++i) {
            boolean changed = false; // 자리바꿈 여부
            for (int j = 0; j < numArr.length - 1 - i; ++j) {
                if (numArr[j] > numArr[j + 1]) {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tmp;
                    changed = true; // 자리바꿈 있었음
                }
            }
            if (!changed) break; // 자리 안바꾸면 없음
            System.out.println();
            for (int k = 0; k < numArr.length; ++k) {
                System.out.print(numArr[k]);
            }
        }
    }
}
