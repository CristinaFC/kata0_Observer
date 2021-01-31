package kata0_observer;

public class TimeStam {
    private final Integer hour, minute, second; 

    public TimeStam(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Integer getHour() {
        return hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public Integer getSecond() {
        return second;
    }

    
    
}
