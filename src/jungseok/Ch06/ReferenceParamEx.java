package jungseok.Ch06;

public class ReferenceParamEx {
    public static void main(String[] args) {

        ReferenceParamEx rp = new ReferenceParamEx();

        int[] arr = {3, 2, 1, 6, 5, 4};
        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum=" + rp.sumArr(arr));
    }

    static void printArr(int[] arr) {

        System.out.print("[");
        for (int i : arr)
            System.out.print(i + ",");
        System.out.println("]");
    }
    static void sortArr(int[] arr) {

        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    int sumArr(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }
}
