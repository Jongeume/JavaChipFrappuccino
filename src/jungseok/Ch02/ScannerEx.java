package jungseok.Ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("Integer.parseInt() 형변환 : " + num);

        int num2 = sc.nextInt();
        System.out.println("nextInt() 형변환 : " + num2);

    }
}
