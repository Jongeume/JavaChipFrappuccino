package jungseok.Ch07;

import static java.lang.System.*;


public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 23, 35);
        out.println(t);

        // t.hour = 13; 클래스 Time의 멤버변수를 private로 지정해주었기에 다른 클래스에서 접근할 수 없음.

        t.setHour(t.getHour() + 1); // 하지만 메서드를 통해서 값을 변경할 수 있음.
        out.println(t);
        t.setMinute(t.getMinute() + 10);
        out.println(t);
        t.setSecond(t.getSecond() + 10);
        out.println(t);
    }
}

class Time {
    private int hour, minute, second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}


