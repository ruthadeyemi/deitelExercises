package revision.chapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if(hour < 24)
            this.hour = hour;
    }

    public int getHour(){
        return hour;
    }

    public void setMinute(int minute) {
        if(minute < 60){
            this.minute = minute;
        }
        if (getHour()>23){
            setMinute(0);
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (getHour()>23 && getMinute() >59){
            setSecond(0);
        }

        if(second < 60) {
            this.second = second;
        }
    }

    public int getSecond(){
        return second;
    }

    public void displayTime(){
        System.out.printf("%d : %d : %d", getHour(), getMinute(), getSecond());
    }

}
