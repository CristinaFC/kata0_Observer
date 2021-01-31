
package kata0_observer;

public class Clock extends Subject {
    private Integer hour,minute,second;

    public Clock(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    
    @Override
    public void updateStatusSubject() {
        ticktack();
        this.notifyObservers();
    }

    @Override
    public Object getStatusSubject() {
        return getTimeStam();
    }

    private void ticktack() {
        hour = minute == 59 && second == 59? (hour + 1) % 23: hour;
        minute = second == 59? (minute + 1) % 60: minute;
        second = (second + 1) % 60;
    }

    private Object getTimeStam() {
        return new TimeStam(hour, minute, second);
    }
    
}
