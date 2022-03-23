package chapterThree;//3.14
public class Clock {
    private int second;
    private int minutes;
    private int hour;
    public Clock(int second, int minutes, int hour) {
        this.second = second;
        this.minutes = minutes;
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        if (second > 59){
            hour = 0;
            second = 0;
            minutes = 0;
        }
       this.second = second;
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        if (minutes > 59){
            hour = 0;
            second = 0;
            minutes = 0;
        }
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (hour > 59){
            hour = 0;
            second = 0;
            minutes = 0;
        }
        this.hour = hour;
    }
    public void displayTime(){
        System.out.printf("%d : %d : %d", getHour(), getMinutes(), getSecond());
    }
}

