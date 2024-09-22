package jungseok.Ch013;

import javax.swing.*;

public class ThreadEx7 {
    public static void main(String[] args) {
        ThreadEx7_1 th1 = new ThreadEx7_1();
        Thread th2 = new Thread(new ThreadEx7_2());

        ThreadEx7_3 thread = new ThreadEx7_3();
        Thread th3 = new Thread(thread);


        th1.start();
        th2.start();
        th3.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력히세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
    }
}

class ThreadEx7_1 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + " = " + i);
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

class ThreadEx7_2 implements Runnable {
    public void run() {
        for (int i = 20; i > 10; i--) {
            System.out.println(Thread.currentThread().getName() + " = " + i);
            try {
                Thread.currentThread().sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

class ThreadEx7_3 implements Runnable {
    public void run() {
        for (int i = 30; i > 20; i--) {
            System.out.println(Thread.currentThread().getName() + " = " + i);
            try {
                Thread.currentThread().sleep(1000);
            } catch (Exception e) {

            }
        }

    }
}