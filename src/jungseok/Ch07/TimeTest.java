package jungseok.Ch07;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12,  35,  30); // hour: 24 일경우 setHour 조건문에 걸림 -> hour : 기본값 0
       // t.hour = 123; Time 클래스의 멤버변수가 private으로 지정하였기에 멤버변수로 접근할 수 없음.
        System.out.println(t);
        t.setHour(t.getHour()+1); //메서드를 통한 접근은 가능하다./[
        System.out.println(t);

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
    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
}
