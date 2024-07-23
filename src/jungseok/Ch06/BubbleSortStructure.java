package jungseok.Ch06;

public class BubbleSortStructure {
    public static void main(String[] args) {

        int[] numArr = new int[10];
        initArr(numArr);
        printArr(numArr);
        sortArr(numArr);
        /*printArr(numArr);*/
    }
    static void initArr(int[] numArr) {

        for (int i = 0; i < numArr.length; ++i) {
            numArr[i] = (int) (Math.random() * 10);
        }
    }
    static void sortArr(int[] numArr) {

        for (int i = 0; i < numArr.length - 1; ++i) {
            boolean changed = false;
            for (int j = 0; j < numArr.length - 1 - i; ++j) {
                if (numArr[j] > numArr[j + 1]) {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tmp;
                    changed = true;
                }
            }
            if (!changed) break;

            printArr(numArr);
        }
    }
    static void printArr(int[] numArr) {

        System.out.println();
        for (int k = 0; k < numArr.length; ++k) {
            System.out.print(numArr[k]);
        }
    }
}
