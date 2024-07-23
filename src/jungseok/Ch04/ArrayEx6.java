package jungseok.Ch04;

public class ArrayEx6 {
    public static void main(String[] args) {

        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; ++i) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();
        for (int i = 0; i < 100; ++i) {
            int n = (int) (Math.random() * 10); //Math.random() = 0~0.99999999....(1보다 작은 무한히 가까운 수)
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        for(int i = 0; i<numArr.length; ++i){
            System.out.print(numArr[i]);
        }
    }
}
