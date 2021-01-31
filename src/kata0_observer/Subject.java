
package kata0_observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
    private final List<Observer> observers = new ArrayList<>();
    
    public abstract void updateStatusSubject();
    public abstract Object getStatusSubject();
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    public void removeOberserver(Observer observer){
        observers.remove(observer);
    }
    
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
